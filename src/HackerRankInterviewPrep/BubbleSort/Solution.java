package HackerRankInterviewPrep.BubbleSort;

import java.util.Arrays;

public class Solution {
    public static void bubbleSort (int[] arr) {
        boolean isSorted = false;
        int arrLength = arr.length - 1;
        int counter = 0;

        while(!isSorted) {
            isSorted = true;

            for (int ii = 0; ii < arrLength; ii++) {
                if(arr[ii] > arr[ii + 1]) {
                    int temp = arr[ii];
                    arr[ii] = arr[ii + 1];
                    arr[ii + 1] = temp;
                    counter++;
                }
                isSorted = false;
            }
            arrLength--;
        }

//        System.out.println(Arrays.toString(arr));
        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        int[] blah = {3, 1, 2, 8, 4};
        bubbleSort(blah);
    }
}