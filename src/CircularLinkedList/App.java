package CircularLinkedList;

public class App {
    public static void main(String[] args) {
        /** Instantiate SinglyLinkedList with 'myList' **/
        CircularLinkedList myList = new CircularLinkedList();

        /**Test insertFirst Method **/
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(99);
        myList.insertFirst(88);

        /**Test insertLast Method **/
        myList.insertLast(9999);

        myList.displayList();
    }
}
