package Stack;

public class MaximumElement {
/** You have an empty sequence, and you will be given N queries.
 * Each query is one of these three types:
 * 1 x  -Push the element x into the stack.
 * 2    -Delete the element present at the top of the stack.
 * 3    -Print the maximum element in the stack.
 *
 * Input Format:
 *
 * The first line of input contains an integer, N.
 * The next N lines each contain an above mentioned query.
 * (It is guaranteed that each query is valid.)
 *
 * Constraints:
 *
 * 1 <= N <= 10^5
 * 1 <= x <= 10^9
 * 1 <= type <= 3
 *
 * Output Format:
 *
 * For each type 3 query, print the maximum element in the stack on a new line.
 *
 * Sample Input:
 *
 * 10
 * 1 97
 * 2
 * 1 20
 * 2
 * 1 26
 * 1 20
 * 2
 * 3
 * 1 91
 * 3
 *
 * Sample Output:
 *
 * 26
 * 91
 *
 */

    private int[] query;
    private int type;
    private int x;

    public MaximumElement(int[] querySize, int typeSize, int xSize) {
        this.query = querySize;
        this.type = typeSize;
        this.x = xSize;
    }

    public void setQueryArray(int[] queryArraySize) {
        query = queryArraySize;
    }

    public void setType(int typeSize) {
        type = typeSize;
    }

    public void push(int x) {
        query[x] = x;
    }
}
