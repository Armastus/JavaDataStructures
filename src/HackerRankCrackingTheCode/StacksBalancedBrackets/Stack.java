package HackerRankCrackingTheCode.StacksBalancedBrackets;

public class Stack {
    public int maxSize;
    private char[] stackArray;
    private int top;

    /** Constructor **/
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public boolean isFull() {
        return (maxSize - 1 == top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public char peak() {
        return stackArray[top];
    }

    public void push(char strChar) {
        if(isFull()) {
            System.out.println("Stack is full.");
        }else{
            top++; //0,
            stackArray[top] = strChar; //stackArray[0] = b
        }
    }

    public char pop() {
        if(isEmpty()) {
            System.out.println("The stack is empty");
            return ' ';
        }else{
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }
}
