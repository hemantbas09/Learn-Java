package collection;

import java.util.*;

// ---------- Day 1: Collection basics ----------
public class Day1Hierarchy {
    public static void run() {
        System.out.println("=== Day 1 ===");
        Collection<Book> books = new ArrayList<>();
        Book b1 = new Book(1, "Summer Love", "Subin Bhatarai");
        Book b2 = new Book(2, "Monsoon", "Subin Bhatarai");
        Book b3 = new Book(3, "Saya", "Subin Bhatarai");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b2); // duplicate on purpose

        System.out.println("Removed b2? " + books.remove(b2));   // removes the FIRST b2 only
        System.out.println("Size: " + books.size());
        System.out.println("Contains b3? " + books.contains(b3));
        System.out.println("Books: " + books);

        books.clear();
        System.out.println("Size after clear: " + books.size());
        System.out.println("Is empty: " + books.isEmpty());
    }
}
