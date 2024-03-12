package org.collections;

import com.sun.source.tree.Tree;
import org.example.Variant;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
        // [  [0, "A"] , [1, "B"]    ] ArrayList
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");

        // [   [null, "A", "B"]  ["A", "B", "C"]  ["B", "C", null]   ] LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        //lets add new "AB" between 1st element and 2nd
        linkedList.add(1, "AB");
        linkedList.add("A");
        linkedList.add("BC");
        // [   [null, "A", "AB"] ["A", "AB", "B"] ["AB", "B", "C"]  ["B", "C", null]   ] LinkedList

        ArrayList<String> newList = new ArrayList<>(strings);
        // equals
        ArrayList<String> newList1 = new ArrayList<>();
        newList1.addAll(strings);
        linkedList.sort(Comparator.naturalOrder());

        for (String s: linkedList) {
            System.out.println(s);
        }

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "AAAAAAAAAAAAAAAAAAA");
        hashMap.put("B", "BBBBBBBBBB");
        hashMap.put("C", "CCC");
        hashMap.get("A");

        HashMap<String, Variant> variantHashMap = new HashMap<>();
        variantHashMap.put("Variant1", new Variant("X", 5326936, "AT", "TTG"));
        variantHashMap.get("Variant1");

        HashMap<String, String> newHashMap1 = new HashMap<>(hashMap);
        // equals
        HashMap<String, String> newHashMap2 = new HashMap<>();
        newHashMap2.putAll(hashMap);

        /*for (String s: hashMap.keySet()) {
            System.out.println(s + "    " + hashMap.get(s));
        }*/
        //Queue <-> Dequeue
        //Tree
        //               X
        //            X      X
        //          X   X   X  X
    }
}
