package collection;

import java.util.*;

// ---------- Day 3: search and removal ----------
public class Day3SearchAndRemove {
    public static void run() {
        System.out.println("=== Day 3 ===");
        List<String> names = new ArrayList<>();

        // 1. Add 6 names (one repeated)

        names.add("Ram");
        names.add("Sita");
        names.add("Rita");
        names.add("Gita");
        names.add("Anrabus");
        names.add("Ram");

        // 2. Print the list, remove one name by VALUE, print again

        System.out.println("All Name" + names); //["Ram","Sita", "Rita", "Gita", "Anrabus", "Ram"]
        names.remove("Ram");
        System.out.println("All Name After Remove Ram" + names); //["Sita", "Rita", "Gita", "Anrabus", "Ram"]

        // 3. Remove another name by POSITION, print again

        names.remove(0); // 0(1)
        System.out.println("All Name After Remove first position" + names); //[ "Rita", "Gita", "Anrabus", "Ram"]

        // 4. Use contains() to check a removed name is gone, print the result

        System.out.println(names.contains("Ram")); //true(we have duplicae when we reomve only first remove another also ram)
        System.out.println(names.contains("Sita")); //false(0(n)

        // 5. Use indexOf() on a missing name and handle -1 with an if

        System.out.println(names.indexOf("Sita")); // -1 becasue there is not value sita 0(n)

        // Handle -1 safely
        int pos = names.indexOf("Sita");
        if (pos != -1) {
            System.out.println("Sita found at " + pos);
        } else {
            System.out.println("Sita is not in the list");
        }

        List<Integer> nums= new ArrayList<>(List.of(10,20,30,40));

        // Prediction A: List<Integer> nums = [5, 10, 15, 20]; what does nums.remove(10) do?
        // Answer: i think it give error of IndexOutOfBoundException it treat 10 as index not laue
        // Prediction B: how do you remove the VALUE 10 instead?
        nums.remove(Integer.valueOf(10));
    }
}
