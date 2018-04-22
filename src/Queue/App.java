package Queue;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(1000);
        myQueue.insert(14);
        myQueue.insert(12);
        myQueue.insert(44);

        /** Since we only have a queue size of 5 and we start adding more.
         * We begin to reinitialize our front back to 0 and now
         * 34 get put at index 0 and 10 at index 1 **/
        //Uncomment to see the reinitialization.
//        myQueue.insert(34);
//        myQueue.insert(10);

        myQueue.view();
    }
}
