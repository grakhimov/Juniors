package org.example;

import java.util.List;



public class VariantFilteringAlex {
    public static void main(String[] args) {
        List<Variant> Variants = List.of(
                new Variant("M", 12028155, "C", "TT"),
                new Variant("ChrM", 12031581, "T", "A"),
                new Variant("X", 86196781, "CAG", "B"),
                new Variant("Y", 961978782, "CAGA", "C"),
                new Variant("3", 161967833, "AA", "C"),
                new Variant("4", 26167844, "C", "G"),
                new Variant("5", 36156755, "GG", "C"),
                new Variant("6", 445656666, "CAGAAG", "G"),
                new Variant("7", 56456777, "A", "CC"),
                new Variant("8", 66345888, "AG", "CA"),
                new Variant("9", 77234999, "CA", "CAA"),
                new Variant("10", 76123000, "CAGTT", "CCCCT")
        );
        for (Variant variant : Variants) {

            System.out.println(variant.getVariantAsString());
            if
            (variant.getChr().equalsIgnoreCase("x") || variant.getChr().equalsIgnoreCase("y")) {
                System.out.println(variant.getVariantAsStringHG38());

            }


        }

    }

}



