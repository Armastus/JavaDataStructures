package HackerRankCrackingTheCode.StacksBalancedBrackets;

public class Solution {

    private static void balancedStack(String str) {

        String balance = "YES";
        int halfStr = Math.round(str.length() / 2);
        int count = halfStr;
        Stack theStack = new Stack(halfStr);
        for (int ii = 0; ii < str.length(); ii++) {
            if (ii == count) {
                if (theStack.peek() == '(' && str.charAt(ii) == ')' ||
                        theStack.peek() == '[' && str.charAt(ii) == ']' ||
                        theStack.peek() == '{' && str.charAt(ii) == '}') {
//                    System.out.print(theStack.peek());
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

    private static void balancedBracketStack(String str) {
        Stack theStack = new Stack(str.length());
        String balance = "YES";

            for(char c : str.toCharArray()){
                switch (c){
                    case '{':
                    case '[':
                    case '(':
                        theStack.push(c);
                        break;
                    case '}':
                        if (theStack.isEmpty() || theStack.pop() != '{')
                            balance = "NO";
                        break;
                    case ']':
                        if (theStack.isEmpty() || theStack.pop() != '[')
                            balance = "NO";
                        break;
                    case ')':
                        if (theStack.isEmpty() || theStack.pop() != '(')
                            balance = "NO";
                        break;
                }
            }

            if (!theStack.isEmpty()) {
                balance = "NO";
            }

            System.out.print(balance);
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String balanced = "{{[[(())]]}}";
        String unbalanced = "{[(])}";
        String bracketBalanced = "({(){}[]})[]";

        int balancedLength = balanced.length();
        Stack balancedStack = new Stack(balancedLength);

        int unbalancedLength = unbalanced.length();
        Stack unbalancedStack = new Stack(unbalancedLength);

        int bracketBalancedLength = bracketBalanced.length();
        Stack bracketBalancedStack = new Stack(bracketBalancedLength);

        for (int ii = 0; ii < balancedLength; ii++) {
//            balancedStack.push(balanced.charAt(ii));
//            System.out.print(balancedStack.peek());
        }

//        balancedStack(balanced);

        for (int yy = 0; yy < unbalancedLength; yy++) {
//            unbalancedStack.push(unbalanced.charAt(yy));
//            System.out.print(unbalancedStack.peek());
        }

//        balancedStack(unbalanced);

        for (int xx = 0; xx < bracketBalancedLength; xx++) {
            bracketBalancedStack.push(bracketBalanced.charAt(xx));
            System.out.print(bracketBalancedStack.peek());
        }

        balancedBracketStack(bracketBalanced);

//        System.out.print(balancedStack);
//        int t = 3;
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int tItr = 0; tItr < t; tItr++) {
//            expression = "nope";
//        }

//        System.out.println(expression);

//        scanner.close();
    }
}
