package Task12;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int[][] multiArr1 = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3}
        };

        int[][] multiArr2 = {
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6}
        };
        int[][] bigger = aTask1.getBiggerArray( multiArr1, multiArr2 );
        System.out.println("Większa tablica:");
        for (int[] ints : bigger) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println();

        String[] strArr1 = {"Ala", "ma", "kota"};
        String[] strArr2 = {"Ala", "ma", "kota", "i", "psa"};
        String[] moreCharsArray = aTask2.moreChars(strArr1, strArr2);
        System.out.println("Tablica z większą ilością znaków:");
        System.out.println(Arrays.toString(moreCharsArray));

        System.out.println();

        int[] numbers = {5, 1, 10, 105, 23, 45, 220, 87, 16};
        int max = aTask3.maxNumber(numbers);
        int min = aTask5.min(numbers);
        System.out.println("Największa liczba z tablicy " + Arrays.toString(numbers));
        System.out.println(max);
        System.out.println("Najmniejsza liczba z tablicy " + Arrays.toString(numbers));
        System.out.println(min);

        System.out.println("-------------------");
        
        int[][] multiArr = {
                {1, 2, 3},
                {8, 9, 10},
                {4, 5, 6},
                {6, 7, 8}
        };
        int[] maxRow = aTask6.maxRow(multiArr);
        System.out.println("Wiersz z największą sumą liczb: " + Arrays.toString(maxRow));
    }
}
