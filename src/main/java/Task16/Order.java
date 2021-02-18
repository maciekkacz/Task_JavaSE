package Task16;

import java.util.List;

public class Order {
    private List<Dish> dishes;

    public Order(List <Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        double dishesCost = PaymentService.calculateDishesSum(dishes);
        double serviceCost = PaymentService.calculateServiceCost(dishesCost);
        double totalCost = dishesCost + serviceCost;
        return String.format("To pay: %.2f, including:\n" +
                        "the cost of the dishes: %.2f \n" +
                        "service charge: %.2f",
                totalCost, dishesCost, serviceCost);
    }
}
