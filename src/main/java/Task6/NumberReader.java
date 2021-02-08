package Task6;

import java.util.Scanner;

public class NumberReader {
    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        double userCount = scanner.nextDouble();
        scanner.close();
        if (userCount > 0) {

            for (double i = 0; i < (userCount + 0.1); i += 0.1) {
                System.out.printf( "%1f" , i );

            }
        } else {
            for (double i = 0; i > (userCount - 0.1); i -= 0.1) {
                System.out.printf( "%1f" , i );
            }

        }
    }
}
