package Task12;
//przyjmuje dwie tablice dwuwymiarowe liczb całkowitych i zwraca tę, w której suma liczb jest większa,
public class aTask1 {

    static int[][] getBiggerArray(int[][] array1, int[][] array2) {
        int sum1 = sumArray(array1);
        int sum2 = sumArray(array2);
        return sum1 > sum2 ? array1 : array2;
    }

    private static int sumArray(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
}
