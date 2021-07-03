import controller.OrderController;
import controller.StorageController;
import order.Order;
import storage.Drink;
import utils.FileHandler;
import utils.Reader;
import utils.Scanner;

import java.io.IOException;

public class Restaurant {

    public static void main(String[] args) { // throws IOException

        FileHandler fileHandler = new FileHandler();
        fileHandler.readFile("Drinks.txt");
        fileHandler.readFile("Meals.txt");
        fileHandler.readFile("KitchenTools.txt");

//        Reader reader = new Reader();
//        reader.printArrayList(fileHandler.readFile("Drinks.txt"));



        // + table szám

//        Drink drink = new Drink();
//        System.out.println(drink.getAmount());
//        orderController.quantityModifierDrink(orderController.takeOrder());
//        System.out.println(orderController.getAvailableQuantity());


        StorageController storageController = new StorageController();
        Reader reader = new Reader();
        storageController.printDrinkStorage();
        storageController.printMealStorage();
        storageController.printKitchenToolStorage();


        OrderController orderController = new OrderController();
        orderController.printOrder(orderController.takeOrder());

        orderController.quantityModifierDrink(orderController.takeOrder());
    }
}
