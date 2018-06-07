package HackerRankDataStructures.ArrayList;

import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> arrRow = new ArrayList<>();
        int n = scanner.nextInt();
        ArrayList<Integer>[] arrColumn = new ArrayList[n];
        for (int ii = 0; ii < n; ii++) {
            int d = scanner.nextInt();
            // System.out.print(d + " ");
            for (int yy = 0; yy < d; yy++) {
                Integer[] dsIntegers = new Integer[d];
                dsIntegers[yy] = scanner.nextInt();
                arrRow.add(dsIntegers[yy]);
                // System.out.print(arrRow.get(yy) + " ");
            }
            arrColumn[ii] = new ArrayList<>(arrRow);
            // System.out.print(arrColumn[ii]);
            arrRow.clear();
            // System.out.println();
        }
        // System.out.print(arrColumn[]);
        // System.out.println();

        int numOfQueries = scanner.nextInt();
        // System.out.print(numOfQueries);

        for (int zz = 0; zz < numOfQueries; zz++) {
            int xCord = scanner.nextInt() - 1;
            int yCord = scanner.nextInt() - 1;

            try
            {
                System.out.println(arrColumn[xCord].get(yCord));
            }catch (IndexOutOfBoundsException error) {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
