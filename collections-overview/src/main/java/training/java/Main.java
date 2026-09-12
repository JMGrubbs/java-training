package training.java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Collection<String> list = new HashSet<>();
        // Collection<String> list = new TreeSet<>();
        // List<String> list = new ArrayList<>();

        String[] names = {"Bob", "Anna", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));

        list.removeIf(s -> s.contains("Gary"));
        System.out.println("Gary has been removed from the list.");
        System.out.println(list);

        // Collections do not have a .sort() method but List does because it is a subclass of Collections.
        // list.sort();

    }
}