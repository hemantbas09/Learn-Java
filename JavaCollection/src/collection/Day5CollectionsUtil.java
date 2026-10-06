package collection;

import java.util.*;

public class Day5CollectionsUtil {
    public static void run() {
        System.out.println("=== Day 5 ===");

        // 1. Changeable list of unsorted numbers
        List<Integer> nums = new ArrayList<>(List.of(2, 3, 1, 5, 4, 6));

        // 2. Sort, then reverse
        Collections.sort(nums);        // O(n log n), changes the list itself
        System.out.println("Sorted (ascending): " + nums);
        Collections.reverse(nums);     // O(n)
        System.out.println("Reversed (descending): " + nums);

        // 3. Max and min (O(n) each)
        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Min: " + Collections.min(nums));

        // 4. Shuffle (order varies on every run)
        Collections.shuffle(nums);
        System.out.println("Shuffled: " + nums);

        // 5. Immutable list: add() throws
        List<String> names = List.of("Hemant", "Bimal", "Bandana");
        try {
            names.add("Ram");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot add: List.of(...) is immutable");
        }

        // 6. Changeable copy: only the copy changes
        List<String> changeable = new ArrayList<>(names);
        changeable.add("Ram");
        System.out.println("Original: " + names);
        System.out.println("Copy: " + changeable);

        // Prediction A: sort changes the list, so it throws on List.of
        try {
            Collections.sort(List.of(3, 1, 2));
        } catch (UnsupportedOperationException e) {
            System.out.println("sort on List.of threw UnsupportedOperationException");
        }

        // Prediction B: contains only reads, so it works
        System.out.println("Contains 2? " + List.of(1, 2, 3).contains(2));   // true
    }
}
