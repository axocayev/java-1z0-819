package az.atlacademy.chapter_3_oop;

import java.io.DataInput;
import java.util.ArrayList;
import java.util.List;

public class Oop {
}


 class Story {
    void recite(int chapter) throws Exception {}
}
 class Adventure extends Story {
    final void recite(final int chapter) { // g1
        switch(chapter) { // g2
            case 2: System.out.print(9);
            default: System.out.print(3);
        }
    }
    public static void main(String... u) {
        var bedtime = new Adventure();
        bedtime.recite(2);
    }
}
abstract class ABSclass{
    protected abstract  void test();
}
interface Iface2{
     default  void test(){

    }
    static  void test3(){

    }
}

class Phone {
    private int size;
    // insert constructor here
    public Phone(int size) {
        this.size=size;
    }
    public static void sendHome(Phone p, int newSize) {
        p = new Phone(newSize);
        p.size = 4;
    }
    public static final void main(String... params) {
        final var phone = new Phone(3);
        sendHome(phone,7);
        System.out.print(phone.size);
    }
}

class Dinosaur {
    class Pterodactyl extends Dinosaur {}
    public void roar() {
        var dino = new Dinosaur();
        dino.new Pterodactyl();
        new Dinosaur.Pterodactyl();
    }
}


class Laptop extends Computer {
    public void startup() {
        System.out.print("laptop-");
    }
}
 class Computer {
    public void startup() {
        System.out.print("computer-");
    }
    public static void main(String[] args) {
        Computer computer = new Laptop();
        Laptop laptop = new Laptop();
        computer.startup();
        laptop.startup();
    }
}

class Cars {
  private   static  int x=12;
  private   int m=12;
    static class ttt{
        int y=x;
        //int n=m;
    }

     class ggg{
        int y=x;
        int n=m;
    }
    private static void drive() {
    /*    static {
            System.out.println("static");
        }*/
        System.out.println("fast");
        { System.out.println("faster"); }
    }
    public static void main(String[] args) {
        drive();
        drive();
    }
}

class Canine {
   /* public String woof(int bark) {
        return "1"+bark.toString();
    }*/
  /*  public String woof(Integer bark) {
        return "2"+bark.toString();
    }*/
    public String woof(Object bark) {
        return "3"+bark.toString();
    }
    public static void main(String[] a) {
        //System.out.println(woof((short)5));
    }
}



interface GameItem {
    int sell();
}
abstract class Vegetable implements GameItem {
    public  int sell() { return 5; }
}
 class Turnip extends Vegetable {
    public final int sell() { return 3; }
    public static void main(String[] expensive) {
        System.out.print(new Turnip().sell());
    }
}

enum DaysOff {
    Thanksgiving, PresidentsDay, ValentinesDay
}
 class Vacation {
    public static void main(String... unused) {
        final DaysOff input = DaysOff.Thanksgiving;
        switch(input) {
            default:
            case  ValentinesDay:
                System.out.print("1");
            case  PresidentsDay:
                System.out.print("2");
        }
    }
}

interface Speak { default int talk() { return 7; } }
interface Sing { default int talk() { return 5; } }
 class Performance implements Sing,Speak {
    public int talk(String... x) {
        return x.length;
    }
    public static void main(String[] notes) {
        System.out.print(new Performance().talk());
    }


     @Override
     public int talk() {
        // List<Number> l=new ArrayList<Long>();


         return 0;
     }
 }