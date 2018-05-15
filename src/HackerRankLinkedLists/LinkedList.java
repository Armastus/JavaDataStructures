package HackerRankLinkedLists;

public class LinkedList<D> {
    // Properties
    Node<D> head;
    int count;

    // Constructor
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }

    public LinkedList() {
        head = newNode;
        count = 1;
    }

    // Methods
    /** add, get, size, isEmpty, remove **/
    public void add(D newData) {
        Node<D> temp = new Node(newData);
        Node<D> current = head;

        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    public D get(int index) {
//        if(index == 0) {
//            return -1;
//        }
        Node<D> current = head;
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
        Node<D> current = head;
        while(current.getNext() != null ) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alice");
        System.out.println((linkedList));
        linkedList.add("Alicey");
        System.out.println(linkedList);
    }
}
