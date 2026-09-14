package dev.lpa;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {


        // --------------------------------MAPS------------------------------------


        // Create a Map
        Map<String, Integer> inventory = new HashMap<>();

        // Add key/value pairs
        inventory.put("Gold", 100);
        inventory.put("Potions", 3);
        inventory.put("Keys", 1);

        // Get a value by key
        int gold = inventory.get("Gold");
        System.out.println("Gold: " + gold);

        // Check whether a key exists
        if (inventory.containsKey("Potions")) {
            System.out.println("Potions found");
        }

        // Check whether a value exists
        if (inventory.containsValue(3)) {
            System.out.println("Something has value 3");
        }

        // Update a value
        inventory.put("Gold", 150);

        // Remove a key/value pair
        inventory.remove("Keys");

        // Number of entries
        System.out.println("Size: " + inventory.size());

        // Loop through keys
        for (String key : inventory.keySet()) {
            System.out.println(key);
        }

        // Loop through values
        for (Integer value : inventory.values()) {
            System.out.println(value);
        }

        // Loop through both key and value
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(
                entry.getKey() + ": " + entry.getValue()
            );
        }

        // Get a default value if the key is missing
        int arrows = inventory.getOrDefault("Arrows", 0);

        // Remove everything
        inventory.clear();


    }
}
