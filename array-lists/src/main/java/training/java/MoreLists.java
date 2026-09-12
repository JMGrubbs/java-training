package training.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas","milk","eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);


        ArrayList<String> nextList = new ArrayList<>(
            List.of("Pikles", "mustard", "cheese")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);
        System.out.println(groceries.get(2));
        System.out.println(groceries.contains("pickles"));
        System.out.println(groceries.contains("milk"));
        System.out.println(groceries.indexOf("mustard"));
        groceries.add("mustard");
        System.out.println(groceries.lastIndexOf("mustard"));

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("mustard"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());


        groceries.addAll(List.of("eggs", "milk", "butter", "cheese"));
        groceries.addAll(Arrays.asList("pickles", "mustard", "apples", "ham"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

        // ArrayList cannot use a primitve type
        // ArrayList<int> ints = new ArrayList<>();

        // This is an example of an "Array Backed List."
        // This allows you to use SOME ArrayList methods on an array.
        // The only real drawback is that cannot be resized.
        String[] originalArray = new String[] {"first", "second", "third"};
        var originalList = Arrays.asList(originalArray);
        originalList.set(0, "one");

        System.out.println("list: "+ originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

    }
}
