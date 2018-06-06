package HackerRankDataStructures.JavaSubarray;

import java.io.*;
import java.util.*;

public class javaSubarray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        int n = scanner.nextInt();
        // int count = 0;
        // int total = 0;
        int[] arr = new int[n];

        int first = scanner.nextInt();
        arr[0] = first;
        int count = first < 0 ? 1 : 0;

        for (int ii = 1; ii < n; ii++) {
            int num = scanner.nextInt();
            arr[ii] = arr[ii - 1] + num;
            // System.out.print(num);
            // System.out.print(arr[ii]);

            if (arr[ii] < 0) {
                // System.out.print(arr[ii]);
                count++;
            }

            for (int yy = 0; yy < ii; yy++) {
                int sub = arr[ii] - arr[yy];
                // System.out.print(sub);
                if (sub < 0) {
                    count++;
                }
            }
        }

        System.out.print(count);

        scanner.close();

//         for (int yy = 0; yy < arr.length; yy++) {
//             tempArr.add(arr[yy]);
//             if (tempArr.get(yy) < 0) {
//                 // System.out.print(tempArr.get(yy)); // -2 -5
//                 count++;
//             }

//             // System.out.print(tempArr);
//             // System.out.println();
//             // System.out.print(tempArr.get(yy));
//             total = total + tempArr.get(yy);
//             if (total < 0) {
//                 // System.out.print(total); // -1 -2 -1
//                 count++;
//             }
//         }

//         total = 0;
//         // System.out.println();
//         // System.out.print(tempArr);
//         // System.out.println();

//         for (int xx = arr.length - 1; xx > 0; xx--) {
//             // tempArr.remove(arr[xx]);
//             // System.out.print(tempArr);
//             total = total + tempArr.get(xx);
//             if (total < 0) {
//                 // System.out.print(total); // -4 -2
//                 count++;
//             }
//             // total += tempArr.get(xx);
//         }

//         total = 0;
//         // System.out.println();
//         for (int zz = 1; zz < n - 1; zz++) {
//             // System.out.print(tempArr.get(zz));
//             // n--;
//             total = total + tempArr.get(zz);
//             if(total < 0 ) {
//                 // System.out.print(total); // -2 -3
//                 count++;
//             }
//             // System.out.print(zz);
//         }
//         System.out.print(count);
    }
}