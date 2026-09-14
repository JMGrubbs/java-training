package dev.lpa;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {

        // ----------------------SETS-------------------------------
        // Create a Set
        Set<String> locations = new HashSet<>();

        // Add values
        locations.add("Town");
        locations.add("Loot");
        locations.add("Dragon");

        // Duplicate values are ignored
        locations.add("Town");

        System.out.println(locations);

        // Check if a value exists
        if (locations.contains("Loot")) {
            System.out.println("Loot exists");
        }

        // Remove a value
        locations.remove("Dragon");

        // Get the number of unique values
        System.out.println("Size: " + locations.size());

        // Loop through the Set
        for (String location : locations) {
            System.out.println(location);
        }

        // Check whether it's empty
        if (locations.isEmpty()) {
            System.out.println("Set is empty");
        }

        // Remove everything
        locations.clear();
    }
}
