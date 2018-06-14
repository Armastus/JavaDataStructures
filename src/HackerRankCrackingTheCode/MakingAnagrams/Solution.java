package HackerRankCrackingTheCode.MakingAnagrams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Character, Integer> anagramA = new HashMap<Character, Integer>();

        HashMap<Character, Integer> anagramB = new HashMap<Character, Integer>();

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int counter = 0;

        for (int ii = 0; ii < a.length(); ii++) {
            Character key = a.charAt(ii);
            if (!anagramA.containsKey(key)) {
                anagramA.put(key, 1);
            } else {
                anagramA.put(key, anagramA.get(key) + 1);
            }
            // System.out.println(key);
        }

        System.out.print(anagramA);

        for (int yy = 0; yy < b.length(); yy++) {
            Character key = b.charAt(yy);
            if (!anagramB.containsKey(key)) {
                anagramB.put(key, 1);
            } else {
                anagramB.put(key, anagramB.get(key) + 1);
            }
            // System.out.println(key);
        }

        System.out.println();
        System.out.print(anagramB);

        Iterator entriesA = anagramA.entrySet().iterator();
        Iterator entriesB = anagramB.entrySet().iterator();

        // while (entriesA.hasNext()) {
        //     Map.Entry entry = (Map.Entry) entriesA.next();
        //     Character key = (Character)entry.getKey();
        //     Integer value = (Integer)entry.getValue();
        //     System.out.println("Key = " + key + ", Value = " + value);
        // }

        // while (entriesB.hasNext()) {
        //     Map.Entry entry = (Map.Entry) entriesB.next();
        //     Character key = (Character)entry.getKey();
        //     Integer value = (Integer)entry.getValue();
        //     System.out.println("Key = " + key + ", Value = " + value);
        // }

        for (Character zz : anagramA.keySet()) {
            // System.out.print(zz);
            // System.out.print(anagramB.keySet());
            Map.Entry entryB = (Map.Entry) entriesB.next();
            // System.out.print(entryB.getKey());
            if (zz.equals(entryB.getKey())) {
                // System.out.print(zz);
                System.out.print(entryB.getKey());
            }
        }

        System.out.println();
        System.out.print(anagramB);

        scanner.close();
    }
}
