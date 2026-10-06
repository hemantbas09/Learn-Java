import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FruitCollections {
    public static void main(String[] args) {
        // 1. A List of 4 fruits, with one repeated
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Mango"); // repeated on purpose

        // 2. A Set built from the list (Set removes duplicates)
        Set<String> fruitSet = new HashSet<>(fruitList);

        // 3. A Map of fruit -> quantity
        Map<String, Integer> fruitQuantity = new HashMap<>();
        fruitQuantity.put("Mango", 5);
        fruitQuantity.put("Banana", 3);
        fruitQuantity.put("Apple", 2);

        // 4. Print results
        System.out.println("List: " + fruitList + "  (size = " + fruitList.size() + ")");
        System.out.println("Set size (duplicates removed): " + fruitSet.size());
        System.out.println("Quantity of Mango: " + fruitQuantity.get("Mango"));
    }
}
