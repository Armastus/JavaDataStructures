package HackerRankInterviewPrep.ArraysLeftRotation;

import java.util.Arrays;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] arr = new int[a.length];
        for (int ii = 0; ii < a.length; ii++) {
            arr[ii] = a[(ii + d) % a.length];
        }
        return arr;
    }


    public static void main(String[] args) {

        int d = 4;

        int[] a = {1, 2, 3, 4, 5};

        int[] result = rotLeft(a, d);
        System.out.print(Arrays.toString(result));
    }
}
