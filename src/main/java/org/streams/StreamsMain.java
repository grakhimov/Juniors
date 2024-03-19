package org.streams;

import org.example.Variant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamsMain {


    public static void main(String[] args) {
/*        List<String> strings = List.of("RC", "TB", "CU", "AA");
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("A")) {
                System.out.println(strings.get(i));
            }
        }

        for (String string : strings) {
            if (string.contains("A")) {
                System.out.println(string);
            }
        }

        strings.stream().filter(v -> v.contains("A")).findFirst();*/

        List<Variant> variants = List.of(
                new Variant("X", 68957345, "C", "T"),
                new Variant("Y", 736584, "CA", "TGG"),
                new Variant("2", 21347, "TC", "CT"),
                new Variant("7", 89986, "CG", "T"),
                new Variant("15", 3457874, "GGA", "TAA")/*,
                new Variant("X", null, "C", "T")*/);

        /*for (int i = 0; i < variants.size(); i++) {
            if (variants.get(i).getPos() > 68957346) {
                System.out.println(variants.get(i).getVarintAsString());
            }
        }*/

        Optional<Variant> optional = variants.stream().filter(x -> x.getPos() > 68957346).findFirst();
        optional.ifPresent(x -> System.out.println(x.getVarintAsString()));

        List<Integer> posList = new ArrayList<>();
        for (int i = 0; i < variants.size(); i++) {
            posList.add(variants.get(i).getPos());
        }

        List<Integer> integerList = variants.stream().map(x -> x.getPos()).toList();
        System.out.println();

    }

    void readFile(String fileName) {
        File myObj = new File(fileName);
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException e) {

        }
        finally {
            System.out.println();
        }
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }//
        myReader.close();
    }
}
