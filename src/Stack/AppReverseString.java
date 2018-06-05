package Stack;

public class AppReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str) {
        int stackSize = str.length(); /** get the stack size **/
        StackReverseString theStack = new StackReverseString(stackSize); /** we make the stack **/

        for(int ii = 0; ii < str.length(); ii++) {
            char ch = str.charAt(ii); /** Getting a char from the input string **/
            theStack.push(ch);
        }

        String result = "";

        /** First in Last out **/
        while(!theStack.isEmpty()) {
            char ch = theStack.pop();
            result = result + ch; /** Appending to the output **/
        }
//[1][1, -2][1, -2, 4][1, -2, 4, -5][1, -2, 4, -5, 1]
//import java.io.*;
//import java.util.*;
//
//        public class Solution {
//            private static final Scanner scanner = new Scanner(System.in);
//
//            public static void main(String[] args) {
//                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//                ArrayList<Integer> tempArr = new ArrayList<Integer>();
//                int n = scanner.nextInt();
//                int count = 0;
//                int total = 0;
//
//                int[] arr = new int[n];
//
//                for (int ii = 0; ii < n; ii++) {
//                    arr[ii] = scanner.nextInt();
//                }
//                scanner.close();
//
//                for (int yy = 0; yy < arr.length; yy++) {
//                    // System.out.print(arr[yy]);
//                    // if (arr[yy] > 0) {
//                    // for (int xx : arr[yy]) {
//                    // System.out.print(n);
//                    // for (int xx = 0; xx < arr.length; xx++) {
//                    System.out.print(arr[n-1]);
//                    // }
//                    n--;
//                    // }
//                    // for (int xx = 0; xx < n; xx++) {
//                    //         tempArr.add(arr[yy]);
//                    //     System.out.print(arr[xx]);
//                    //     n--;
//                    //     System.out.print(xx);
//                    // }
//                    // }else{
//                    //     count++;
//                    //     tempArr.add(arr[yy]);
//                    // }
//                    // System.out.print(tempArr);
//                    // for (int xx : tempArr) {
//                    //     // System.out.print("[" + xx + "]" + " ");
//                    //     // total += xx;
//                    //     // System.out.print(total + " ");
//                    //     System.out.print(xx + " ");
//                    //     // if (total < 0) {
//                    //     //     System.out.print(total + " ");
//                    //     // }
//                    // }
//                    // total = 0;
//
//                    // total = tempArr
//                    // for (int xx : tempArr) {
//                    //     System.out.print("[" + xx + "]" + " ");
//                    //     total += xx;
//                    //     if (total < 0) {
//                    //         System.out.print(total + " ");
//                    //     }else{
//                    //         total = 0;
//                    //         xx-1;
//                    //         total += xx;
//                    //         if (total < 0) {
//                    //             System.out.print(total + " ");
//                    //         }
//                    //     }
//                    // }
//                    // System.out.print(total);
//                }
//            }
//        }

        return result;
    }
}
