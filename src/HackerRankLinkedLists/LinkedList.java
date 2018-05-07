package HackerRankLinkedLists;

public class LinkedList {
    // Properties
    Node head;
    int count;

    // Constructor
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }

    public LinkedList(Node newNode) {
        head = newNode;
        count = 1;
    }

    // Methods
    /** add, get, size, isEmpty, remove **/
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;

        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    public int get(int index) {
        if(index == 0) {
            return -1;
        }
        Node current = head;
        for(int ii = 1; ii < index; ii++) {
            current = current.getNext();
        }
        return current.getData();
    }

    public int size() {
        return count;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public void remove() {
        // removing from back of the list
        Node current = head;
        while(current.getNext() != null ) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {

    }
}
