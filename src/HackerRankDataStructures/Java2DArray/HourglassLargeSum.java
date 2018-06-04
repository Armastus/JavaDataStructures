package HackerRankDataStructures.Java2DArray;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class HourglassLargeSum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[][] arr = new int[6][6];
//
//        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
//                arr[i][j] = arrItem;
//            }
//        }
//        scanner.close();

        int mat[][] = { {10, 20, 30, 40, 50, 60, 70, 80, 90},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50, 51, 89},
        };


        for(int i=0; i<mat.length; i++) {
            System.out.println(mat.length);
            for(int j=0; j<mat[i].length; j++) {
//                System.out.println(mat[i].length);
                System.out.println("Values at arr["+i+"]["+j+"] is "+mat[i][j]);
            }
        }

        // System.out.print(arr[5][4]);
        for (int ii = 0; ii < arr.length; ii++) {
            for (int yy = 0; yy < arr[ii].length; yy++) {
                // System.out.println(arr[ii][yy]);
                // System.out.println("Values at arr["+ii+"]["+yy+"] is "+arr[ii][yy]);

            }
        }
    }
}

