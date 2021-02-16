package Task14;

import java.util.Map;

public class Main {
    private static String name = "src/txt.csv";

    public static void main(String[] args) {
        // File check
        Wholesaler wholesaler = new Wholesaler();
        wholesaler.readFIle( name );

        System.out.println("------------------------------");


        Structure structure = new Structure();
        Map <String, Integer> stringIntegerMap = structure.readProductsFromFile( name );
        structure.printStars( stringIntegerMap );
    }
}
