package utils;

import storage.Drink;
import storage.KitchenTool;
import storage.Meal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

    final static String DRINKS_TXT = "src/resources/Drinks.txt";
    final static String MEALS_TXT = "src/resources/Meals.txt";
    final static String KITCHEN_TOOLS_TXT = "src/resources/KitchenTools.txt";


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
                case DRINKS_TXT -> {
                    drinks.add(new Drink(parts[0], Integer.parseInt(parts[1]), parts[2].equals("alkoholos"), parts[3]));
                    // return drinks;
                }
                case MEALS_TXT -> {
                    meals.add(new Meal(parts[0], Integer.parseInt(parts[1]), parts[2]));
                    // return meals;
                }
                case KITCHEN_TOOLS_TXT -> {
                    kitchenTools.add(new KitchenTool(parts[0], Integer.parseInt(parts[1])));
                    // return kitchenTools;
                }
            }
        }

        for (Drink drink : drinks) {
            System.out.println(drink.getName() + ": " + drink.getAmount() + " -> " + drink.getType()); // + " " + drinks.get(i).getType()
        }
//        for (int i = 0; i < drinks.size(); i++) {
//            System.out.println(drinks.get(i).getName() + ": " + drinks.get(i).getAmount() + " -> " + drinks.get(i).getType()); // + " " + drinks.get(i).getType()
//        }
        for (Meal meal : meals) {
            System.out.println(meal.getName() + ": " + meal.getAmount());
        }
        // return null;
    }
}

