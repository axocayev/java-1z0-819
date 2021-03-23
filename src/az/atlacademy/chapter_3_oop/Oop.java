package az.atlacademy.chapter_3_oop;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

enum DaysOff {
    Thanksgiving, PresidentsDay, ValentinesDay
}

interface Iface2 {
    static void test3() {

    }

    default void test() {

    }
}


interface GameItem {
    int sell();
}

interface Speak {
    default int talk() {
        return 7;
    }
}

interface Sing {
    default int talk() {
        return 5;
    }
}

interface Pump {
    void pump(double psi);
}

interface Bend extends Pump {
    String k = "";

    private static void stroke() {

    }

    void bend(double tensileStrength);
}

public class Oop {
}


class Story {
    void recite(int chapter) throws Exception {
    }
}

class Adventure extends Story {
    public static void main(String... u) {
        var bedtime = new Adventure();
        bedtime.recite(2);
    }

    final void recite(final int chapter) { // g1
        switch (chapter) { // g2
            case 2:
                System.out.print(9);
            default:
                System.out.print(3);
        }
    }
}

abstract class ABSclass {
    protected abstract void test();
}

class Phone {
    private int size;

    // insert constructor here
    public Phone(int size) {
        this.size = size;
    }

    public static void sendHome(Phone p, int newSize) {
        p = new Phone(newSize);
        p.size = 4;
    }

    public static final void main(String... params) {
        final var phone = new Phone(3);
        sendHome(phone, 7);
        System.out.print(phone.size);
    }
}

class Dinosaur {
    public void roar() {
        var dino = new Dinosaur();
        dino.new Pterodactyl();
        new Dinosaur.Pterodactyl();
    }

    class Pterodactyl extends Dinosaur {
    }
}

class Laptop extends Computer {
    public void startup() {
        System.out.print("laptop-");
    }
}

class Computer {
    public static void main(String[] args) {
        Computer computer = new Laptop();
        Laptop laptop = new Laptop();
        computer.startup();
        laptop.startup();
    }

    public void startup() {
        System.out.print("computer-");
    }
}

class Cars {
    private static int x = 12;
    private int m = 12;

    private static void drive() {
    /*    static {
            System.out.println("static");
        }*/
        System.out.println("fast");
        {
            System.out.println("faster");
        }
    }

    public static void main(String[] args) {
        drive();
        drive();
    }

    static class ttt {
        int y = x;
        //int n=m;
    }

    class ggg {
        int y = x;
        int n = m;
    }
}

class Canine {
    public static void main(String[] a) {
        //System.out.println(woof((short)5));
    }

    /* public String woof(int bark) {
         return "1"+bark.toString();
     }*/
  /*  public String woof(Integer bark) {
        return "2"+bark.toString();
    }*/
    public String woof(Object bark) {
        return "3" + bark.toString();
    }
}

abstract class Vegetable implements GameItem {
    public int sell() {
        return 5;
    }
}

class Turnip extends Vegetable {
    public static void main(String[] expensive) {
        System.out.print(new Turnip().sell());
    }

    public final int sell() {
        return 3;
    }
}

class Vacation {
    public static void main(String... unused) {
        final DaysOff input = DaysOff.Thanksgiving;
        switch (input) {
            default:
            case ValentinesDay:
                System.out.print("1");
            case PresidentsDay:
                System.out.print("2");
        }
    }
}

class Performance implements Sing, Speak {
    public static void main(String[] notes) {
        System.out.print(new Performance().talk());
    }

    public int talk(String... x) {
        return x.length;
    }

    @Override
    public int talk() {
        // List<Number> l=new ArrayList<Long>();


        return 0;
    }
}

class Robot {
    public static final void apply(Bend instruction, double input) {
        instruction.bend(input);
    }

    public static void main(String... future) {
        final Robot r = new Robot();
        // r.apply(x -> System.out.print(x + " bent!"), 5);
    }
}


class Tool {
    private void repair() {
    } // r1

    void use() {
    } // r2
}

class Hammer extends Tool {
    private int repair() {
        return 0;
    } // r3

    //private void use() {} // r4
    public void bang() {
    } // r5
}


class Bush extends Plant {
    String type = "bush";
}

class Plant {
    String type = "plant";

    public static void main(String[] args) {
        Plant w1 = new Bush();
        Bush w2 = new Bush();
        Plant w3 = w2;
        System.out.print(w1.type + "," + w2.type + "," + w3.type);
    }
}


class Penguin {
    public static void main(String[] args) {
        boolean match = false;
        Baby egg = Baby.EGG;
        switch (egg) {
            case EGG:
                match = true;
        }
    }

    enum Baby {EGG}

    class Chick {
        String h = "ff";
        //  enum Baby { EGG }
    }
}