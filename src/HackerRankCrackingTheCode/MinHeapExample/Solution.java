package HackerRankCrackingTheCode.MinHeapExample;

public class Solution {
    public static void main(String[] args) {
        MinIntHeap minHeap = new MinIntHeap();

        int[] nodes = {10, 15, 20, 17, 25};

        for (int ii = 0; ii < nodes.length; ii++) {
            minHeap.add(nodes[ii]);
        }
    }
}
