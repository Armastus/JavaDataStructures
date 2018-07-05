package HackerRankInterviewPrep.ArrayGreedyAlgorithm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length-1;i++){
            int sum  = Math.abs(arr[i]- arr[i+1]);
            if(min >(sum))
                min = sum;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};


        int result = minimumAbsoluteDifference(arr);

        System.out.println(result);
    }
}

