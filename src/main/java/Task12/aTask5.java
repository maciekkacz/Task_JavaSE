package Task12;

public class aTask5 {

     static int min(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }

        }
        return min;
    }
}
