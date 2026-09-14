package dev.lpa;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

    public static void main(String[] args) {

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
