package az.atlacademy.chapert_1_data_type;

import java.util.Arrays;
import java.util.Comparator;

public class DataTypes_cybex {
    public static void main(String[] args) {
        test28();
    }
    public static void test24(){
       // bool b = null;
       // Bool bl = null;
        //int i = null;
        Integer in = null;
        String s = null;
    }
    public static void test28(){
        boolean carrot = true;
        Boolean potato = false;
        var broccoli = true;
        carrot = carrot & potato;
        System.out.println(carrot);
        broccoli = broccoli ? !carrot : potato;
        System.out.println(broccoli);
        potato = !broccoli ^ carrot;
        System.out.println(potato);
        System.out.println(carrot + "," + potato + "," + broccoli);
    }

    public static void test26() {

        var sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(1, 2);
        System.out.println(sb);
    }


    public static void test29() {
        var babies = Arrays.asList("chick", "cygnet", "duckling");
        babies.replaceAll(x -> {
            var newValue = "baby";
            return newValue;
        });
        System.out.println(babies);
    }

    public static void test25() {
        int height = 2, length = 3;
        boolean w = height > 1 | --length < 4;
        var x = height != 2 ? length++ : height;
        boolean z = height % length == 0;
        System.out.println(w + "-" + x + "-" + z);
    }

    public static void test21() {
        // var sb = new StringBuilder("radical")
        //       .insert(sb.length(), "robots");
        //System.out.println(sb);
    }

    public static void test3() {
        float q = 4.0f;
        Float q1 = 4.0f;
        double q2 = 4.0f;
        // Double q3 = 4.0f;
        Object q4 = 4.0f;

    }

    public static void test5() {
        var line = new StringBuilder("-");
        var anotherLine = line.append("-");
        System.out.println(line);
        System.out.println(anotherLine);
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
    }

    public static void test10() {
        Comparator<String> c1 = (j, k) -> 0;
        Comparator<String> c2 = (String j, String k) -> 0;
        Comparator<String> c3 = (String j, String k) -> 0;
        //Comparator<String> c4 = (var j,  k) -> 0;
        Comparator<String> c5 = (var j, var k) -> 0;
    }

    public static void test18() {
        var happy = " :) - (: ";
        var really = happy.trim();
        var question = happy.substring(1, happy.length() - 1);
        System.out.println(really.equals(question));
    }
}


class Airplane {
    static int start = 2;
    final int end;

    public Airplane(int x) {
        x = 4;
        end = x;
    }

    public void fly(int distance) {
        System.out.print(end - start + " ");
        System.out.print(distance);
    }

    public static void main(String... start) {
        new Airplane(10).fly(5);
    }
}

class Rematerialize {
    public static void main(String[] input) {
        int init = 11;
        int split = 3;
        int partA = init / split;
        int partB = init % split;
        int result = split * (partB + partA);
        System.out.print(result);
    }
}