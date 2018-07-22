package BSTPractice;

public class Node {
    Node left;
    Node right;
    int data;

    public Node (int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value  < data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data){
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void inOrder() {
        if (left != null) {
            left.inOrder();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.inOrder();
        }
    }

    public void preOrder() {
        System.out.print(data + " ");
        if (left != null) {
            left.preOrder();
        }
    }

    public void postOrder() {
        if (left != null) {
            left.postOrder();
        }
        if (right != null) {
            right.postOrder();
        }
        System.out.print(data + " ");
    }
}
