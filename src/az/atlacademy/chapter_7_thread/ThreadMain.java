package az.atlacademy.chapter_7_thread;

public class ThreadMain {
}


// This class exposes a publicly accessible counter
// to help demonstrate race condition problem
/*class Counter {
    public static long count = 0;
}*/
// This class implements Runnable interface
// Its run method increments the counter three times
/*
class UseCounter implements Runnable {
    public void increment() {
        // increments the counter and prints the value
        // of the counter shared between threads
        synchronized(this) {
            Counter.count++;
            System.out.print(Counter.count + " ");
            System.out.println(Thread.currentThread().getName());
        }
    }
    public void run() {
        increment();
        increment();
        increment();
    }
}*/
// This class creates three threads
 /*class RaceCondition {
    public static void main(String args[]) {
        UseCounter c = new UseCounter();
        Thread t1 = new Thread(c);
        t1.setName("t1");
        Thread t2 = new Thread(c);
        t2.setName("t2");
        Thread t3 = new Thread(c);
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
*/
//----------

// Balls class has a globally accessible data member to hold the number of balls thrown
class Balls {
    public static long balls = 0;
}
// Runs class has a globally accessible data member to hold the number of runs scored
class Runs {
    public static long runs = 0;
}

// Counter class has two methods – IncrementBallAfterRun and IncrementRunAfterBall.
// For demonstrating deadlock, we call these two methods in the run method, so that
// locking can be requested in opposite order in these two methods
class Counter implements Runnable {
    // this method increments runs variable first and then increments the balls variable
    // since these variables are accessible from other threads,
    // we need to acquire a lock before processing them
    public void IncrementBallAfterRun() {
        // since we're updating runs variable first, first lock the Runs.class
        synchronized(Runs.class) {
            // lock on Balls.class before updating balls variable
            synchronized(Balls.class) {
                Runs.runs++;
                Balls.balls++;
            }
        }
    }
    public void IncrementRunAfterBall() {
        // since we're updating balls variable first; so first lock Balls.class
        synchronized(Balls.class) {
            // acquire lock on Runs.class before updating runs variable
            synchronized(Runs.class) {
                Balls.balls++;
                Runs.runs++;
            }
        }
    }
    public void run() {
        // call these two methods which acquire locks in different order
        // depending on thread scheduling and the order of lock acquision,
        // a deadlock may or may not arise
        IncrementBallAfterRun();
        IncrementRunAfterBall();
    }
}
 class DeadLock {
    public static void main(String args[]) throws InterruptedException {
        Counter c = new Counter();
        // create two threads and start them at the same time
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
        System.out.println("Waiting for threads to complete execution...");
        t1.join();
        t2.join();
        System.out.println("Done.");
    }
}