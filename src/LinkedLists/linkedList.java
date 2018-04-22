//package LinkedLists;
//
//public class Node {
//    Node head;
//    Node tail;
//    Node next;
//    Node prev;
//    int data;
//
//    /**
//     * Constructor:
//     * NOTE: Every class has a constructor by default.
//     * It just may be invisible. This is just the
//     * smarts of Java so that you can access
//     * the class within main.
//     **/
//    public Node(Node head, Node tail, Node next, Node prev, int data) {
//        super();
//        this.data = data;
//        this.tail = tail;
//        this.head = head;
//        this.prev = prev;
//        this.next = next;
//    }
//
//    public void addToHead(int data) {
//        // Node current = this.newNode;
//
//        if (this.newNode.tail != null) {
//            this.newNode.next = newNode;
//        } else {
//            this.newNode.head = newNode;
//        }
//        this.newNode.tail = newNode;
////        if(newNode == null) {
////            newNode = new Node(data);
////        }
////
////        Node current = newNode;
////
////        while(current.prev != null) {
////            current = current.prev;
////        }
////
////        current.prev = new Node(data);
////        return current;
//    }
//
//    public void addToTail(int data) {
//        if (newNode == null) {
//            newNode = new Node(data);
//        }
//
//        Node current = newNode;
//
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = new Node(data);
//        this.newNode.tail = current;
//        //return current;
//    }
//
//    public int removeHead() {
//        if (this.newNode == null) {
//            return Integer.parseInt(null);
//        }
//
//        int val = this.newNode.data;
//
//        this.newNode = this.newNode.next;
//
//        if (this.newNode != null) {
//            this.newNode.prev = null;
//        } else {
//            this.newNode.tail = null;
//        }
//        return val;
//    }
//}
//
//public class linkedList {
//    public static void main(String[] args) {
//        Node ll = new Node();
//
//        /** Print each head as it's inputted **/
//        ll.addToHead(100);
//
//        //System.out.println(ll.addToHead(100));
//        //System.out.println("Added to head " + ll.addToHead(100).prev.data);
//        //System.out.println("Added to head " + ll.addToHead(200).prev.data);
//
//        /** Print each tail as it's inputted **/
//        // System.out.println("Added to tail " + ll.addToTail(300).next.data);
//
//        /** Print the head **/
//        //System.out.println("Print the head data " + ll.head.data);
//
//        //  ll.removeHead();
//        //  System.out.println(ll.removeHead());
//    }
//}