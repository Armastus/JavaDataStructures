package HackerRankCrackingTheCode.StacksBalancedBrackets;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static void balancedStack(String str) {

        String balance = "YES";
        int halfStr = Math.round(str.length() / 2);
        int count = halfStr;
        Stack theStack = new Stack(halfStr);
        for (int ii = 0; ii < str.length(); ii++) {
            if (ii == count) {
                if (theStack.peak() == '(' && str.charAt(ii) == ')' ||
                        theStack.peak() == '[' && str.charAt(ii) == ']' ||
                        theStack.peak() == '{' && str.charAt(ii) == '}') {
//                    System.out.print(theStack.peak());
                    theStack.pop();
                    count++;
                } else {
                    balance = "NO";
                    break;
                }
            }
            if (ii < halfStr) {
                theStack.push(str.charAt(ii));
            }
        }
        System.out.println(balance);
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String expression = "{{[[(())}}}}";
        int arrLength = expression.length();
        Stack theStack = new Stack(arrLength);

        for (int ii = 0; ii < arrLength; ii++) {
            theStack.push(expression.charAt(ii));
            System.out.print(theStack.peak());
        }

        balancedStack(expression);

//        System.out.print(theStack);
//        int t = 3;
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int tItr = 0; tItr < t; tItr++) {
//            expression = "nope";
//        }

//        System.out.println(expression);

//        scanner.close();
    }
}
