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
        return result;
    }
}
