package HackerRankCrackingTheCode.HashTableRansomNote;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> magHT = new Hashtable();
        Hashtable<String, Integer> noteHT = new Hashtable();
        int minLength = 0;
        int maxLength = 0;
//        int count = 1;

        for (String ii : magazine) {
            // System.out.print(ii + " ");

            if (!magHT.containsKey(ii)) {
                magHT.put(ii, 1);
            } else {
//                Integer d = (Integer) magHT.get(ii);
                magHT.put(ii, magHT.get(ii) + 1);
            }
        }
        System.out.print(magHT);
        System.out.println();

        for (String yy : note) {
            // System.out.print(yy + " ");
            if (!noteHT.containsKey(yy)) {
                noteHT.put(yy, 1);
            } else {
                noteHT.put(yy, noteHT.get(yy) + 1);
            }
        }
        System.out.print(noteHT);
        System.out.println();

        /** example **/
        for (Map.Entry magEntry : magHT.entrySet()) {
            System.out.println(magEntry);
            System.out.println(magEntry.getKey());
            System.out.println(magEntry.getValue());
        }

        /** auto generated of the Map.Entry. kinda cool :) **/
//        Map.Entry magEntry = new Map.Entry() {
//            @Override
//            public Object getKey() {
//                return null;
//            }
//
//            @Override
//            public Object getValue() {
//                return null;
//            }
//
//            @Override
//            public Object setValue(Object value) {
//                return null;
//            }
//        }

        minLength = Math.min(magHT.size(), noteHT.size());
        maxLength = Math.max(magHT.size(), noteHT.size());

        for (int xx = 0; xx < minLength; xx++) {

        }
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] mn = scanner.nextLine().split(" ");

        int m = 6;

        int n = 4;

        String[] magazine = new String[m];

        String[] magazineItems = {"give", "me", "one", "today", "today", "night"};
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = {"give", "one", "grand", "today"};
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

//        scanner.close();
    }
}
