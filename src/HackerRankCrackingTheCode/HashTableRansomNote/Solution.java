package HackerRankCrackingTheCode.HashTableRansomNote;

import java.util.*;

public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String, Integer> magHT = new Hashtable();
        Hashtable<String, Integer> noteHT = new Hashtable();
        Hashtable<String, Integer> tempHT = new Hashtable();

        for (String ii : magazine) {
            // System.out.print(ii + " ");

            if (!magHT.containsKey(ii)) {
                magHT.put(ii, 1);
            } else {
//                Integer d = (Integer) magHT.get(ii);
                magHT.put(ii, magHT.get(ii) + 1);
            }
        }

//        System.out.print(magHT);
//        System.out.println();

        for (String yy : note) {
            // System.out.print(yy + " ");
            if (!noteHT.containsKey(yy)) {
                noteHT.put(yy, 1);
            } else {
                noteHT.put(yy, noteHT.get(yy) + 1);
            }
        }

//        System.out.print(noteHT);
//        System.out.println();

        /** example **/
//        for (Map.Entry magEntry : magHT.entrySet()) {
//            System.out.println(magEntry);
//            System.out.println(magEntry.getKey());
//            System.out.println(magEntry.getValue());
//        }

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

        /** Iterator Example **/
//        Iterator<Map.Entry<String, Integer>> itrMag = magHT.entrySet().iterator();
//        Iterator<Map.Entry<String, Integer>> itrNote = noteHT.entrySet().iterator();





        for (Map.Entry noteEntry : noteHT.entrySet()) {
            if (noteEntry.getValue() != null && magHT.get(noteEntry.getKey()) != null && noteEntry.getValue().equals(magHT.get(noteEntry.getKey()))) {
                tempHT.put((String) noteEntry.getKey(), (Integer)noteEntry.getValue());
            }
        }

//        System.out.print(tempHT);

        if (noteHT.equals(tempHT)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static void main(String[] args) {
        String[] magazineWords = {"give", "me", "one", "grand", "today", "night"};
        String[] magazine = new String[magazineWords.length];

        for (int i = 0; i < magazine.length; i++) {
            magazine[i] = magazineWords[i];
        }

        String[] noteWords = {"give", "one", "grand", "today"};
        String[] note = new String[noteWords.length];

        for (int i = 0; i < note.length; i++) {
            note[i] = noteWords[i];
        }

        checkMagazine(magazine, note);

//        scanner.close();
    }
}
