package org.example;

import java.util.ArrayList;

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
        System.out.println(variant.getVariantAsStringHG38());
        System.out.println(variant.getVarintAsString());
        variant.setAlt("TTAA");
        System.out.println(variant.getVarintAsString());

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