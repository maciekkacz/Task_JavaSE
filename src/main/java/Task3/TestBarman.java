package Task3;



public class TestBarman {
    public static void main(String[] args) {
        Drink drink = Barman.createDrink( "Orange juice", 200, "apple juice", 350, "vodka", 50 );
        Barman.printDrink( drink );

    }
}
