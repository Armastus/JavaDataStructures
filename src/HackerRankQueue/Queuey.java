package HackerRankQueue;

import java.util.LinkedList;

public class Queuey {

    LinkedList queue = new LinkedList();

    // Making a queue instance.
    public Queuey() {
        queue = new LinkedList();
    }

    // Is our queue empty.
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Return the size of the queue.
    public int size() {
        return queue.size();
    }

    // Enqueue an item.
    public void enqueue(int n) {
        queue.addLast(n);
    }

    // Dequeue an item.
    public int dequeue() {
        return (int) queue.remove(0);
    }

    // Peek at the first item.
    public int peek() {
        return (int) queue.get(0);
    }

    public void push(int n) {
        queue.push(n);
    }

    public int pop() {
        return (int) queue.pop();
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
