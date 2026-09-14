package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces added", 2);

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card Collection with Kings copied", 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List Copy of Kings", 1);

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


        // -----------------QUEUE----------------------
         // Create a Queue
        Queue<String> turns = new LinkedList<>();

        // Add values to the back of the queue
        turns.offer("Player");
        turns.offer("Goblin");
        turns.offer("Dragon");

        // Look at the front item without removing it
        String nextTurn = turns.peek();
        System.out.println("Next: " + nextTurn);

        // Remove and return the front item
        String currentTurn = turns.poll();
        System.out.println("Taking turn: " + currentTurn);

        // Queue is now:
        // Goblin, Dragon

        // Number of items
        System.out.println("Size: " + turns.size());

        // Check whether a value exists
        if (turns.contains("Dragon")) {
            System.out.println("Dragon is waiting");
        }

        // Loop through the queue
        for (String turn : turns) {
            System.out.println(turn);
        }

        // Process everything in FIFO order
        while (!turns.isEmpty()) {
            String turn = turns.poll();
            System.out.println("Processing: " + turn);
        }

        // Check whether queue is empty
        if (turns.isEmpty()) {
            System.out.println("Queue is empty");
        }
    }
}
