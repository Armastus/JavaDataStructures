package BigONotation;

public class bigONotation {

    /**
     * CONSTANT RUNTIME
     * Big O Notation: "O(1)"
     **/
    public static void log(int[] array) {
        System.out.println(array[0]);
        System.out.println(array[1]);
    }

    /**
     * LINEAR RUNTIME
     * Big O Notation: "O(n)"
     **/
    public static void logAll(int[] array) {
        for (int ii = 0; ii < array.length; ii++) {
            System.out.println(array[ii]);
        }
    }

    /**
     * EXPONENTIAL RUNTIME
     * Big O Notation: "O(n^2)"
     **/
    public static void addAndLog(char[] array) {
        for (int ii = 0; ii < array.length; ii++) {
            for (int jj = 0; jj < array.length; jj++) {
                System.out.println(array[ii] + array[jj]);
            }
        }
    }

    /**
     * LOGARITHMIC RUNTIME
     * Big O Notation: "O(log n)"
     **/
    public static int binarySearch(int[] array, int key) {
        double low = 0;
        double high = array.length - 1;
        double mid;
        int element;

        while (low <= high) {
            mid = Math.floor((low + high) / 2);
            element = array[(int) mid];

            if (element < key) {
                low = mid + 1;
            } else if (element > key) {
                high = mid + 1;
            } else {
                return (int) mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        /** CONSTANT RUNTIME TEST **/
        int[] arrayConst1 = {1, 2, 3, 4};
        int[] arrayConst2 = {1, 2, 3, 4, 5};
        bigONotation.log(arrayConst1);
        bigONotation.log(arrayConst2);
        System.out.print("\n");

        /** LINEAR RUNTIME TEST **/
        int[] arrayLin1 = {1, 2, 3, 4, 5};
        int[] arrayLin2 = {1, 2, 3, 4, 5, 6};
        int[] arrayLin3 = {1, 2, 3, 4, 5, 6, 7};
        bigONotation.logAll(arrayLin1);
        bigONotation.logAll(arrayLin2);
        bigONotation.logAll(arrayLin3);
        System.out.print("\n");

        /** EXPONENTIAL RUNTIME TEST **/
        char[] arrayExp1 = {'A', 'B', 'C'};
        char[] arrayExp2 = {'A', 'B', 'C', 'D'};
        char[] arrayExp3 = {'A', 'B', 'C', 'D', 'E'};
        bigONotation.addAndLog(arrayExp1);
        bigONotation.addAndLog(arrayExp2);
        bigONotation.addAndLog(arrayExp3);
        System.out.print("\n");

        /** LOGARITHMIC RUNTIME TEST **/
        int[] arrayLog = {2, 3, 5, 7, 12, 16, 36, 39, 42, 56, 71};
        System.out.println(bigONotation.binarySearch(arrayLog, 7));
    }
}