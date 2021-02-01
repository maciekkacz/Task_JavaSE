package Task3;

public class Barman {
    public static Drink createDrink(String name1, int capacity1, String name2, int capacity2,String name3, int capacity3) {
        Ingredient ingredient1 = new Ingredient( name1, capacity1 );
        Ingredient ingredient2 = new Ingredient( name2, capacity2 );
        Ingredient ingredient3 = new Ingredient( name3, capacity3 );

        return new Drink( ingredient1, ingredient2, ingredient3 );
    }
    public static void printDrink(Drink drink) {
        double ingredientSum = drink.getIngredient1().getCapacity() +
                drink.getIngredient2().getCapacity() +
                drink.getIngredient3().getCapacity();
        double ing1Part = drink.getIngredient1().getCapacity() / ingredientSum;
        double ing2Part = drink.getIngredient2().getCapacity() / ingredientSum;
        double ing3Part = drink.getIngredient3().getCapacity() / ingredientSum;
        System.out.printf( "The ingredients for the drink are: %s, %s, %s " + "in proportions %.2f, %.2f, %.2f." +
                        "Its capacity is %.0fml",
                drink.getIngredient1().getName(), drink.getIngredient2().getName(), drink.getIngredient3().getName(),
                ing1Part, ing2Part, ing3Part,
                ingredientSum );
    }
}
