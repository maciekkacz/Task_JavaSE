package Task16;

import static Task16.RestaurantApp.printMenu;
import static Task16.RestaurantApp.printSummary;
import static Task16.RestaurantApp.takeOrder;

public class MenuTest{
    public static void main(String[] args) {
            System.out.println( "Welcome to our restaurant" );
            printMenu();
            Order order = takeOrder();
            printSummary( order );

    }
}
