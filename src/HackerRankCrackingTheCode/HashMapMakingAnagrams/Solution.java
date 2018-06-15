package HackerRankCrackingTheCode.HashMapMakingAnagrams;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Character, Integer> anagramA = new HashMap<Character, Integer>();
        HashMap<Character, Integer> anagramB = new HashMap<Character, Integer>();
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        int counter = 0;

        for (int ii = 0; ii < a.length(); ii++) {
            Character key = a.charAt(ii);
            if (!anagramA.containsKey(key)) {
                anagramA.put(key, 1);
            } else {
                anagramA.put(key, anagramA.get(key) + 1);
            }
        }

        System.out.print(anagramA);

        for (int yy = 0; yy < b.length(); yy++) {
            Character key = b.charAt(yy);
            if (!anagramA.containsKey(key)) {
                counter++;
            } else {
                anagramA.put(key, anagramA.get(key) - 1);
            }
        }

        System.out.println();
        System.out.print(anagramA);
        System.out.println();

        for (Map.Entry<Character, Integer> entry : anagramA.entrySet()) {
            if (entry.getValue() != 0) {
                counter+=Math.abs(entry.getValue());
            }
        }

/** Next 2 for loops just create hashmap of second string **/
//        for (int ii = 0; ii < b.length(); ii++) {
//            Character key = b.charAt(ii);
//            if (!anagramB.containsKey(key)) {
//                anagramB.put(key, 1);
//            } else {
//                anagramB.put(key, anagramB.get(key) + 1);
//            }
//        }
//
//        System.out.print(anagramB);
//
//        for (int yy = 0; yy < a.length(); yy++) {
//            Character key = a.charAt(yy);
//            if (!anagramB.containsKey(key)) {
//                counter++;
//            } else {
//                anagramB.put(key, anagramB.get(key) * 0);
//            }
//        }
//
//        System.out.println();
//        System.out.print(anagramB);


        /** Iterator Example **/
//        Iterator iteratorA = anagramA.entrySet().iterator();
//        Iterator iteratorB = anagramB.entrySet().iterator();


        /** Map.Entry Example **/
        // while (iteratorA.hasNext()) {
        //     Map.Entry entry = (Map.Entry) iteratorA.next();
        //     Character key = (Character)entry.getKey();
        //     Integer value = (Integer)entry.getValue();
        //     System.out.println("Key = " + key + ", Value = " + value);
        // }

        // while (iteratorB.hasNext()) {
        //     Map.Entry entry = (Map.Entry) iteratorB.next();
        //     Character key = (Character)entry.getKey();
        //     Integer value = (Integer)entry.getValue();
        //     System.out.println("Key = " + key + ", Value = " + value);
        // }

        System.out.println();
        System.out.println(counter);

        scanner.close();
    }
}
