package utils;

import storage.Drink;
import storage.KitchenTool;
import storage.Meal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

    final static String drinksTxt = "src/resources/Drinks.txt";
    final static String mealsTxt = "src/resources/Meals.txt";
    final static String kitchenToolsTxt = "src/resources/KitchenTools.txt";


    public static void Buffer(String fileName) throws IOException {

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<Drink> drinks = new ArrayList<>();
        ArrayList<Meal> meals = new ArrayList<>();
        ArrayList<KitchenTool> kitchenTools = new ArrayList<>();

        for (String line; (line = bufferedReader.readLine()) != null; ) {
            String[] parts = line.split(",");
//            if (fileName.equals("src/resources/Drinks.txt")) {
//                drinks.add(new Drink(parts[0], Integer.parseInt(parts[1]), parts[2].equals("alkoholos")));
//                // return drinks;
//            } else if (fileName.equals("src/resources/Meals.txt")) {
//                meals.add(new Meal(parts[0], Integer.parseInt(parts[1]), parts[2]));
//                // return meals;
//            } else if (fileName.equals("src/resources/KitchenTools.txt")) {
//                kitchenTools.add(new KitchenTool(parts[0], Integer.parseInt(parts[1])));
//                // return kitchenTools;
//            }
//        }

            switch (fileName) {
                case drinksTxt -> {
                    drinks.add(new Drink(parts[0], Integer.parseInt(parts[1]), parts[2].equals("alkoholos"), parts[3]));
                    // return drinks;
                }
                case mealsTxt -> {
                    meals.add(new Meal(parts[0], Integer.parseInt(parts[1]), parts[2]));
                    // return meals;
                }
                case kitchenToolsTxt -> {
                    kitchenTools.add(new KitchenTool(parts[0], Integer.parseInt(parts[1])));
                    // return kitchenTools;
                }
            }
        }

        for (int i = 0; i < drinks.size(); i++) {
            System.out.println(drinks.get(i).getName() + ": " + drinks.get(i).getAmount() + " -> " + drinks.get(i).getType()); // + " " + drinks.get(i).getType()
        }
        for (int i = 0; i < meals.size(); i++) {
            System.out.println(meals.get(i).getName() + ": " + meals.get(i).getAmount());
        }
        // return null;
    }
}

