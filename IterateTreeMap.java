import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

public class IterateTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add elements to the TreeMap
        treeMap.put("Mani", 100);
        treeMap.put("Surya", 200);
        treeMap.put("Anand", 300);
        treeMap.put("Saravana", 400);
        treeMap.put("Priya", 500);

        // Method 1: Using an enhanced for loop (for-each)
        System.out.println("Iteration using for-each loop:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Method 2: Using an iterator
        System.out.println("\nIteration using iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Method 3: Using forEach method (Java 8 and later)
        System.out.println("\nIteration using forEach method:");
        treeMap.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
