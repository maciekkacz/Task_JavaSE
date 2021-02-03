package Task5;

public class FizzBuzzIter {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0 ) {
                System.out.println(i + " FlizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println(i + " Flizz");
            }
        }
    }

}
