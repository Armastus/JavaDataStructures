package HackerRankInterviewPrep.StackAlternateCharacters;

import java.util.Stack;

public class Solution {
    static int alternatingCharacters(String s) {
        Stack theStack = new Stack();
        int counter = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'A':
                case 'B':
                    if (!theStack.isEmpty()) {
                        if (theStack.peek() == (Object)'A' && c == 'A' || theStack.peek() == (Object)'B' && c == 'B') {
                            theStack.pop();
                            counter++;
                        }
                    }
                    theStack.push(c);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.print(alternatingCharacters("AABABAAABB"));
    }
}
