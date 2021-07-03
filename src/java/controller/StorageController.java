package controller;

import storage.Drink;
import storage.KitchenTool;
import storage.Meal;
import utils.FileHandler;
import utils.Reader;

import java.util.ArrayList;
import java.util.List;

public class StorageController {
    /**
     * StorageController class shall be used to handle our storages
     * It shall dynamically handle the amounts each of our storage elements
     */

    public List<Drink> drinkList;
    public List<Meal> mealList;
    public List<KitchenTool> toolList;


    public StorageController() {
        Reader reader = new Reader();
        drinkList = reader.getDrinks();
        mealList = reader.getMeals();
        toolList = reader.getKitchenTools();
    }


    public void printDrinkStorage() {
        for (int i = 0; i < drinkList.size(); i++) {
            System.out.println(drinkList.get(i).getName() + ": " + drinkList.get(i).getAmount());
        }
    }

    public void printMealStorage() {
        for (int i = 0; i < mealList.size(); i++) {
            System.out.println(mealList.get(i).getName() + ": " + mealList.get(i).getAmount());
        }
    }

    public void printKitchenToolStorage() {
        for (int i = 0; i < drinkList.size(); i++) {
            System.out.println(drinkList.get(i).getName() + ": " + drinkList.get(i).getAmount());
        }
    }
}
