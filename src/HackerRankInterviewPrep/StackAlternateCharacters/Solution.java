package HackerRankInterviewPrep.StackAlternateCharacters;

import Stack.Stack;

public class Solution {
    static int alternatingCharacters(String s) {
        Stack theStack = new Stack(s.length());
        int counter = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'A':
                case 'B':
                    if (theStack.isEmpty()) {
                        theStack.push(c);
                        break;
                    }
                    if (theStack.peak() == 'A' && s.charAt(c) == 'A' || theStack.peak() == 'B' && s.charAt(c) == 'B') {
                        counter++;
                        break;
                    } else {
                        theStack.push(c);
                        break;
                    }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        alternatingCharacters("AABABAAABB");
    }
}
