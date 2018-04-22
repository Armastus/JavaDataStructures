package Queue;

public class Queue {
    private int maxSize; /** Initialize container with the set number of slots. **/
    private long[] queueArray; /** Slots to maintain the data. **/
    /** front and rear variables are our pointers **/
    private int front; /** This will be the index position for the element in the front. **/
    private int rear; /** This will be the index position for the element in the rear. **/
    private int numItems; /** Counter to maintain the number of items in our queue. **/

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0; /** Index position of the first slot of the array. **/
        rear = -1; /** There is no item in the array yet to be considered as the last item. **/
        numItems = 0; /** No items in the array yet **/
    }

    /** Increment our queue **/
    public void insert(long jj) {
        /** Check if the queue is full we can reinitialize the
         * rear back to -1. **/
        if(rear == maxSize - 1) {
            rear = -1;
        }
            rear++;
            queueArray[rear] = jj;
            numItems++;
    }

    /** Remove item from front of the queue **/
    public long remove() {
        long temp = queueArray[front];
        front++;

        /** We can set front back to the 0th index so that we can utilize
         * the entire array again. **/
        if(front == maxSize) {
            front = 0;
        }
        numItems--;
        return temp;
    }

    /** So that we can see what is at the front of our queue **/
    public long peak() {
        return queueArray[front];
    }

    /** Return if our queueu isEmpty **/
    public boolean isEmpty() {
        return (numItems == 0);
    }

    public boolean isFull() {
        return (numItems == maxSize);
    }

    public void view() {
        System.out.print("[ ");
        for(int ii = 0; ii < queueArray.length; ii++) {
            System.out.print(queueArray[ii] + " ");
        }
        System.out.print(" ]");
    }
}
