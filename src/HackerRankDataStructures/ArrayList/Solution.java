package HackerRankDataStructures.ArrayList;

import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<Integer> arrRow = new ArrayList<Integer>();
        ArrayList<Integer> arrColumn = new ArrayList<Integer>();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int q = scanner.nextInt();
        // System.out.print(d);
        for (int ii = 1; ii <= n; ii++) {
            arrColumn.add(ii);
            for (int yy = 0; yy < d; yy++) {
                int num = scanner.nextInt();
                // d[yy] = scanner.nextInt();
                arrRow.add(num);
                // System.out.print(arrRow.get(yy) + " ");
                // System.out.println(arrRow.get(0) + " ");
            }
        }
        // System.out.print(arrRow.size());
        for(int zz = 0; zz < q; zz++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            arrRow.get(x);
            // System.out.print(y);
            // System.out.print(arrRow.get(x));
            // System.out.print(arrRow.get(y));
            // System.out.print(q);
        }
        // for (int zz = 0; zz < arrList.size(); zz++) {
        //     System.out.print(arrList.get(zz));
        // }
    }
}