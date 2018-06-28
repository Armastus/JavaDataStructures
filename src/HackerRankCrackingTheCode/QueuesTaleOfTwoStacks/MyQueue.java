package HackerRankCrackingTheCode.QueuesTaleOfTwoStacks;

import java.util.*;

public class MyQueue<D> {
    LinkedList<D>queue = new LinkedList();

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void enqueue(D n) {
        queue.addLast(n);
    }

    public D dequeue() {
        return queue.remove(0);
    }

    public D peek() {
        return queue.get(0);
    }
}
