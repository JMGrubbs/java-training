package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {

        // --------------------------------LIST--------------------------------

        // Create a List
        List<String> inventory = new ArrayList<>();

        // Add values
        inventory.add("Sword");
        inventory.add("Potion");
        inventory.add("Gold");

        // Lists allow duplicates
        inventory.add("Potion");

        // Get a value by index
        String firstItem = inventory.get(0);
        System.out.println("First item: " + firstItem);

        // Change a value
        inventory.set(0, "Axe");

        // Check whether a value exists
        if (inventory.contains("Potion")) {
            System.out.println("Potion found");
        }

        // Remove by value
        inventory.remove("Gold");

        // Remove by index
        inventory.remove(0);

        // Number of items
        System.out.println("Size: " + inventory.size());

        // Loop through values
        for (String item : inventory) {
            System.out.println(item);
        }

        // Loop using indexes
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(i + ": " + inventory.get(i));
        }

        // Check whether it's empty
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty");
        }

        // Remove everything
        inventory.clear();
    }
}
