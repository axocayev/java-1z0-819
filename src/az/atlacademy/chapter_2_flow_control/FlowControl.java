package az.atlacademy.chapter_2_flow_control;

import java.util.List;

public class FlowControl {
    public static void main(String[] args) {
        //String s[]=new String[]{"anar","lale","azer"};
        //perform(s);
        test30();
    }

    static void test30() {
        final var javaVersions = List.of(9, 10, 11);
        var exams = List.of("1Z0-811", "1Z0-819");

      V:  for (var e1 : javaVersions) {

           E: for (String e2 : exams)
                System.out.println(e1 + "_" + e2);
            break;
        }
    }

    static void test28() {
        if (3 > 4)
            System.out.println();
        else {
            System.out.println();
            System.out.println();
        }
    }

    static void test12() {
        final var GOOD = 100;
        var score = 10;
        switch (score) {
            default:
            case 1:
                System.out.print("1-");
            case -1:
                System.out.print("2-");
                break;
            // case 4,5 : System.out.print("3-");
            case 6:
                System.out.print("4-");
            case 9:
                System.out.print("5-");
        }
    }

    static void test11() {
        var bottles = List.of("glass", "plastic", "can");
        for (int type = 1; type < bottles.size(); ) {
            System.out.print(bottles.get(type) + "-");
            if (type < bottles.size()) break;
        }
        System.out.print("end");
    }

    public static void perform(String[] circus) {
        for (var i = 0; i < circus.length; i++)
            System.out.print(circus[circus.length - i - 1]);
    }

    static void test9() {
        var race = "";

        do {
            race += "x";
            break;
        } while (true);
        System.out.println(race);
    }

    public static void test4() {
        var quest = List.of(3);
        for (var zelda : quest) {
            System.out.print(zelda);
        }
    }

    public static void test3() {
        int m = 0, n = 0;
        while (m < 5) {
            n++;
            if (m == 3)
                continue;

            switch (m) {
                case 0:
                case 1:
                    n++;
                default:
                    n++;
            }
            m++;
        }
        System.out.println(m + " " + n);
    }

    public static void test2() {
        var gas = true;
        do {
            System.out.println("helium");
            gas = gas ^ gas;
            gas = !gas;
        } while (!gas);

    }

    public void magic() {
        do {
            // int trick = 0;
            //LOOP: do {
            // trick++;
            //   } while (trick < 2--);
            //    continue LOOP;
        } while (1 > 2);
        // System.out.println(trick);
    }
}

class ThePlan {
    public static void main(String[] input) {
        var plan = 1;
        plan = plan + --plan;
        System.out.println(plan);
        /*if (plan == 1) {
            System.out.print("Plan A");
        } else {
            if (plan == 2) System.out.print("Plan B");
        } else System.out.print("Plan C");*/
    }
}

class Park {
    public final static void main(String... arguments) {
        int pterodactyl = 8;
        long triceratops = 3;
        if (pterodactyl % 3 > 1 + 1)
            triceratops++;
        triceratops--;
        System.out.print(triceratops);
    }
}

class Kansas {
    public static void main(String[] args) {
        int colorOfRainbow = 10;
        final int red = 5;
        switch (colorOfRainbow) {
            default:
                System.out.print("Home");
                break;
            case red:
                System.out.print("Away");
        }
    }
}

enum Season {SPRING, SUMMER, WINTER}

class Weather {
    public int getAverageTemperate(Season s) {
        switch (s) {
            default:
            case WINTER:
                return 30;
        }

    }

}