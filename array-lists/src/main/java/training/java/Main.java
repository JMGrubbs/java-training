package training.java;

import java.util.ArrayList;

/**
 * GroceryItem
 */
record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        GroceryItem[] groceryArray = new GroceryItem[3];

        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);

        // ArrayList objectList = new ArrayList<>();

        // objectList.add(new GroceryItem("Butter"));
        // objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Apples", "PRODUCE", 10));

        groceryList.add(0, new GroceryItem("Tots", "FROZEN", 2));
        groceryList.set(0, new GroceryItem("Hot Pockets", "FROZEN", 1));

        groceryList.remove(1); // removes the first element of an array, in this case tots
    }
}