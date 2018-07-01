package HackerRankInterviewPrep.TwoStrings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        HashMap<Character, Integer> s1Map = new HashMap<>();
        int counter = 0;
        String sharedSubStr = "NO";


        for (int ii = 0; ii < s1.length(); ii++) {
            Character keyS1 = s1.charAt(ii);
            if (!s1Map.containsKey(keyS1)) {
                s1Map.put(keyS1, 1);
            }
        }

        for (int yy = 0; yy < s2.length(); yy++) {
            Character keyS2 = s2.charAt(yy);
            if (s1Map.containsKey(keyS2)) {
                counter++;
            }
        }

        if (counter > 0) {
            sharedSubStr = "YES";
        }

        return sharedSubStr;
    }


    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";
        String result = twoStrings(s1, s2);

        System.out.print(result);
    }
}
