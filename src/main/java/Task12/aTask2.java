package Task12;

import java.util.Arrays;

//przyjmuje dwie tablice z napisami i zwraca tę z nich, w której łączna liczba znaków
// we wszystkich słowach jest większa. Przykładowo dla tablic ["aa", "bb"], ["aaa", "bbb"] zwrócona zostanie
// druga tablica, bo łączna liczba znaków wynosi w niej 6,
public class aTask2 {

    public static String[] moreChars(String[] array1, String[] array2) {
        int chars1 = sumChars(array1);
        int chars2 = sumChars(array2);
        return chars1 > chars2 ? array1 : array2;
    }

    static int sumChars(String[] array) {
        return Arrays.stream(array)
                .mapToInt(String::length)
                .sum();

    }
}
