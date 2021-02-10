package Task12;

import java.util.Arrays;

public class aTask6 {
    static int[] maxRow(int[][] array) {
        int maxSum = Arrays.stream(array[0]).sum();
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            int rowSum = Arrays.stream(array[i]).sum();
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxIndex = i;
            }
        }
        return array[maxIndex];
    }
}
