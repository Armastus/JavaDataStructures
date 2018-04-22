package SinglyLinkedList;

/** A singly linked list is a 'one directional
 * list of nodes. **/
public class SinglyLinkedList {
    private Node first;


    /** This constructor is not needed as Java
     * defines this by default. But we put it here
     * so that we can get a visual of what is going on.
     */
    public SinglyLinkedList() {
        first = null;
    }

    /** If 'first' is equal to 'null' then
     * that means we don't have anymore nodes. **/
    public boolean isEmpty() {
        return (first == null);
    }

    /**insertFirst Method **/
    /** Method insertFirst is used to insert
     * at the beginning of the list */
    /** NOTE: insertFirst will insert at the
     * beginning of the linkedList. */
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        /**We point the newNode to the next item
         * which was the first (old first) node. **/
        newNode.next = first;
        /** Now we point the first node to the newNode **/
        /** See attached image for visual of what is happening **/
        first = newNode;
    }

    /** deleteFirst Method **/
    /** See attached image for reference **/
    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    /**insertLast Method**/
    /** In this method we will need to loop to
     * the end of the linkedList while it is not null.
     * Once we reach the end (null) then we will create
     * a newNode and assign newNode to data and make
     * the current.next = newNode rather then it being null. **/
    /**NOTE: This is not the most efficient way of doing this
     * because is needs to traverse through the whole list to
     * get to the end (null) **/
    public void insertLast(int data) {
        Node current = first;

        while(current.next != null) {
            current = current.next;
        }

        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public void displayList() {
        System.out.println("List (first --> last) ");

        /** Loop through each node to display nodes. **/
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
