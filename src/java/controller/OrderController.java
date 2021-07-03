package controller;

import order.Order;
import storage.Drink;
import storage.Meal;
import utils.Scanner;


public class OrderController {


    /**
     * here we make the orders with the scanner input datas!
     */

    private final int TABLE_NUMBER = Scanner.intScanner("What is your table number?");
    private final String ORDER_NAME = Scanner.strScanner("What is your order?");
    private final int QUANTITY = Scanner.intScanner("How many?");
    private final boolean IS_FOOD = "yes".equals(Scanner.strScanner("Is food?"));

    private int availableQuantity;

/*    // in an empty constructor defining as follows:

    public OrderController() {
        TABLE_NUMBER = Scanner.intScanner("What is your table number?");
        ORDER_NAME = Scanner.strScanner("What is your order?");
        QUANTITY = Scanner.intScanner("How many?");
        IS_FOOD = "yes".equals(Scanner.strScanner("Is food?"));
    }*/

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }


    Order order = new Order();

    public Order takeOrder() {
        Order order = new Order(TABLE_NUMBER, ORDER_NAME, QUANTITY, IS_FOOD);
        return order;
    }

    public void printOrder(Order order) {
        System.out.println(order.getOrderName() + " quantity: " + order.getQuantity() +
                " table number: " + order.getTableNumber());
    }

    public void quantityModifierDrink(Order order) {
        // order can be decreasing when ordering foods (the guests)

        // order by the waiter who orders from kitchen increasing - separate function!!!

        /**
         TODO case 1 if guest order, decreasing quantity
         TODO case 2 make new food on kitchen increasing quantity
         */


        if (!IS_FOOD) {
            // TODO name checker!!!
            // TODO change the glasses amount as well!!!!

            // This is an empty Object, never meets my request :)
            Drink drink = new Drink(); // instead of it, I need the list!!!
            if (ORDER_NAME.equals(drink.getName())) {
                availableQuantity = drink.getAmount() - this.QUANTITY;
                System.out.println(drink.getName() + " quantity successfully changed!");
                System.out.println("pohár is also successfully changed!");
        } else {
            Meal meal = new Meal(); // instead of it, I need the list!!!
            if (ORDER_NAME.equals(meal.getName())) {
                availableQuantity = meal.getAmount() - this.QUANTITY;
                System.out.println(meal.getName() + " quantity successfully changed!");
                // TODO change KitchenTools
                }
            }
        }
    }
}
