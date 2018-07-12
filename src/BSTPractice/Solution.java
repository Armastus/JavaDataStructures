package BSTPractice;

public class Solution {
    public static void main(String[] args) {
        Node node = new Node(5);

        node.insert(10);
        node.insert(3);
        node.insert(4);
        node.insert(2);
        node.insert(7);
        node.insert(6);
        node.insert(8);

        node.contains(8);

        node.inOrder();
        System.out.println();
        node.preOrder();
        System.out.println();
        node.postOrder();
    }
}
