package Task8;

import java.util.Scanner;

public class Barman {

    private static Scanner scanner = new Scanner( System.in );

    public static Drink createDrink() {
        System.out.println("Enter the amount of ingredients");
        int ingredientsNumber = scanner.nextInt();
        scanner.nextLine();
        Ingredient[] ingredients = new Ingredient[ingredientsNumber];

        for (int i = 0; i < ingredients.length; i++) {
            ingredients[i] = ingredient();
        }
        return new Drink( ingredients );
    }

    private static Ingredient ingredient() {
        System.out.println("enter ingredient name");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.printf( "enter amounts " );

        double amount = scanner.nextDouble();
        scanner.nextLine();
        return new Ingredient( name, amount );
    }

    public static void printDrink(Drink drink) {
        Ingredient[] ingredients = drink.getIngredients();
        System.out.printf("Drink include with %d ingredients:\n", ingredients.length);
        for (Ingredient ingredient : ingredients) {
            System.out.printf( " - %s (%.0f)\n", ingredient.getName(), ingredient.getAmount() );
        }
    }
}
