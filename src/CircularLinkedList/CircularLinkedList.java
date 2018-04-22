package CircularLinkedList;

public class CircularLinkedList {
    private Node first;
    private Node last;

    /** This constructor is not needed as Java
     * defines this by default. But we put it here
     * so that we can get a visual of what is going on.
     */
    public CircularLinkedList() {
        first = null;
        last = null;
    }

    /** isEmpty Method **/
    /** This will check if first node isEmpty **/
    private boolean isEmpty() {
        return first == null;
    }

    /** insertFirst Method **/
    public void insertFirst(int data) {
        Node newNode = new Node();

        newNode.data = data;

        /** If node is empty (null) make the last
         * node in the list equal to the newNode.
         */
        if (isEmpty()) {
            last = newNode;
        }

        newNode.next = first;/** Assign the newNode to the old first.**/
        first = newNode;/**First place.**/
    }

    /** insertLast Method **/
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        }else {
            last.next = newNode;/**The next value of the last node will point to the new node.**/
            last = newNode; /**We make the new node we created be the last one in the list.**/
        }
    }

    /** deleteFirst Method **/
    public int deleteFirst() {
        int temp = first.data;

        if(first.next == null) {
            last = null;
        }
        first = first.next; /**First will point to old's next value**/
        return temp;
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
