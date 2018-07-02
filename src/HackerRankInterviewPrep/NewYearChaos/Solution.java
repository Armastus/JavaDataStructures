package HackerRankInterviewPrep.NewYearChaos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    static void minimumBribes(int[] q) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean isSorted = false;
        int counter = 0;
        int lineLength = q.length - 1;
        String chaotic = "";

        while(!isSorted) {
            isSorted = true;
            for (int ii = 0; ii < lineLength; ii++) {
                if (q[ii] > q[ii + 1]) {
                    if (!hm.containsKey(q[ii])) {
                        hm.put(q[ii], 1);
                    } else {
                        hm.put(q[ii], hm.get(q[ii]) + 1);
                    }
                    int temp = q[ii];
                    q[ii] = q[ii + 1];
                    q[ii + 1] = temp;
                    counter++;
                }

                isSorted = false;
            }
            lineLength--;
        }

//        System.out.println(counter);
//        System.out.println(hm);
//        System.out.println(Arrays.toString(q));

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() >= 3) {
                chaotic = "Too chaotic";
                break;
            }
        }

        if (chaotic == "Too chaotic") {
            System.out.println(chaotic);
        } else {
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {
        int[] peepsLineOne = {2, 1, 5, 3, 4};
        minimumBribes(peepsLineOne);

        int[] peepsLineTwo = {2, 5, 1, 3, 4};
        minimumBribes(peepsLineTwo);
    }
}
