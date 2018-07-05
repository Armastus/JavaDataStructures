package HackerRankInterviewPrep.ArraysMinSwapsTwo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int halfWayPoint = arr[0];
        int counter = 0;
        boolean isSorted = false;

        if (arr != null) {
            halfWayPoint = (arr[0] + arr[arr.length - 1]) / 2;
            if (halfWayPoint < arr[0]) {
                int temp = halfWayPoint;
                halfWayPoint = arr[0];
                arr[0] = temp;
                counter++;
            }
        }

        while(!isSorted) {
            for (int ii = 0; ii < arr.length; ii++) {
                if ()
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5};

        minimumSwaps(arr);
    }
}
