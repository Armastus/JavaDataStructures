package Stack;

public class StackReverseString {

    /** This will store the size of the stack. **/
    public int maxSize;
    /** A stack array that is an array that contains
     * type int.
     */
    private char[] stackArray;
    /** This wil represent the last item that is on top
     * of the stack. **/
    private int top;

    /** Constructor **/
    public StackReverseString(int size) {
        /** Max size of our array will be the size past into
         * this maxSize.
         */
        this.maxSize = size;
        /** this.stackArray will be initialized with the maxSize **/
        this.stackArray = new char[maxSize];
        /** The top of the array is set to -1 so that
         * when we start incrementing our stack, it will start be
         * initialized to 0.
         */
        this.top = -1;
    }

    /** push method that will begin incrementing our stack. **/
    public void push(char jj) {
        /** Create a way to make sure that the user does not
         * push any more items to the stack then was initialized.
         */
        if(isFull()) {
            System.out.println("This stack is already full.");
        }else{
            /** Start incrementing the top of the stack **/
            top++;
            /** Assign stackArray with index position [top] with the value
             * that was passed in this method.  **/
            stackArray[top] = jj;
        }
    }

    /** pop method **/
    public char pop() {
        /** Create a way to tell user that the stack is empty
         * when they attempt to pop more items that there actually are.
         */
        if(isEmpty()) {
            System.out.println("The stack is already empty.");
            /** This just return 0 to say there is nothing. **/
            return 0;
        }else{
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    /** peak method
     * This just return the item that is on top of the stack. **/
    public char peak() {
        return stackArray[top];
    }

    /** isEmpty method
     * to just let us know when the stack is empty. **/
    public boolean isEmpty() {
        return (top == -1);
    }

    /** isFull method
     * To just let us know when our stack is full **/
    public boolean isFull() {
        return (maxSize - 1 == top);
    }
}
