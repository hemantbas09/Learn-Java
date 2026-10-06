package collection;

import java.util.*;

// ---------- Day 2: ArrayList basics ----------
public class Day2ArrayListBasics {
    public static void run() {
        System.out.println("=== Day 2 ===");
        List<String> students = new ArrayList<>();
        students.add("Ram");
        students.add("Sita");
        students.add("Rita");

        System.out.println(students);
        System.out.println(students.get(2));
        System.out.println(students.get(0));
        System.out.println(students.size());

        String old = students.set(2, "Hemant");
        System.out.println(old);

        students.add(0, "Anrabus");
        System.out.println(students);

        students.clear();
        System.out.println(students.isEmpty());

        // 3 items means valid indexes are 0..2, so get(3) throws IndexOutOfBoundsException
        // System.out.println(students.get(3));
    }
}
