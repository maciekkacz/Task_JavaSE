package Task12;
//zwraca największą liczbę z tablicy typu int[],
public class aTask3 {

     static int maxNumber(int[] array) {
        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }

        }
        return max;
    }

}
