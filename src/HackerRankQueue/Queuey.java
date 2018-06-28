package HackerRankQueue;

import java.util.LinkedList;

// Added Generic of type <D>
public class Queuey<D> {

    LinkedList<D>queue = new LinkedList();

    // Making a queue instance.
    /** This is our constructor which we could make if we want. **/
//    public Queuey() {
//        queue = new LinkedList();
//    }
    /****************************/

    // Is our queue empty.
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Return the size of the queue.
    public int size() {
        return queue.size();
    }

    // Enqueue an item.
    public void enqueue(D n) {
        queue.addLast(n);
    }

    // Dequeue an item.
    public D dequeue() {
        return queue.remove(0);
    }

    // Peek at the first item.
    public D peek() {
        return queue.get(0);
    }

    public void push(D n) {
        queue.push(n);
    }

    public D pop() {
        return queue.pop();
    }

    public static void main(String[] args) {
        Queuey numQueue = new Queuey();

        numQueue.enqueue(5);
        numQueue.enqueue(7);
        numQueue.enqueue(2);
        System.out.println("First out: " + numQueue.dequeue());
        System.out.println("Peek at second item: " + numQueue.peek());
        System.out.println("Second out: " + numQueue.dequeue());
        System.out.println("Third out: " + numQueue.dequeue());

        System.out.println();

        numQueue.push(1);
        numQueue.push(4);
        numQueue.push(8);
        numQueue.push(9);
        System.out.println("Last in First out: " + numQueue.pop());
        System.out.println("Last in First out: " + numQueue.pop());
        System.out.println("Last in First out: " + numQueue.pop());
        System.out.println("Last in First out: " + numQueue.pop());
    }
}
