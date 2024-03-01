package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static int abc;
    private static String str;

    public static void main(String[] args) {
        /*NewClass newClass = new NewClass();
        System.out.println(newClass.getSum(0, 1));
        int ad = 0;
        String st = "ava";
        getNothing(st);
        String st1 = st + "aaa";
        getNothing(st1);*/
        Variant variant = new Variant("X", 4952378, "AT", "TTG");

/*        System.out.println(variant.getVarintAsString());
        variant.setAlt("TTAA");
        System.out.println(variant.getVarintAsString());*/

        if (!variant.getChr().equalsIgnoreCase("x")) {
            System.out.println(variant.getVariantAsStringHG38());
        } else if(variant.getRef().contains("T")) {
            System.out.println(variant.getRef());
        }
        else {
            System.out.println(variant.getVarintAsString());
        }
        if (variant.getPos() >= 1000000) {
            System.out.println(variant.getVarintAsString());
        }
        // table truth for && (and) operator
        // true & true -> true
        // true & false -> false
        // false & true -> false
        // false & false -> true

        // table truth for || (or) operator
        // true | true -> true
        // true | false -> true
        // false | true -> true
        // false | false -> false

        // table truth for ! (not) operator
        // !true -> false
        // !false -> true
        if (variant.getRef().contains("C") && variant.getAlt().contains("C")) {
            System.out.println(variant.getVarintAsString());
        }

        switch (variant.getRef()) {
            case "A": {
                System.out.println("A");
                break;
            }
            case "T":
                System.out.println("T");
                break;
        }
        for (int i = 49; i >= 0; i--) {
            System.out.println(i);
        }

        List<Integer> integerList = List.of(0,1,2,3,4,5); //[[0] [1] [2] [3] [4] [5]]
        for (Integer i: integerList) {
            System.out.println(i);
        }

        List<String> strings = List.of("A", "B", "C", "D", "E");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        for (String s: strings) {
            System.out.println(s);
        }
    }

    private static void getNothing(String text) {
        System.out.println(text);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    public static Integer sumI(int a, int b) {
        return a + b;
    }

    protected static void getSt() {
        System.out.println(str);
    }

    public static int getAbc() {
        return abc;
    }

    public static void setAbc(int abc) {
        Main.abc = abc;
    }
}