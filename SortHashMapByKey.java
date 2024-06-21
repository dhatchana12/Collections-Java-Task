import java.util.HashMap;
import java.util.TreeMap;

public class SortHashMapByKey {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("Zebra", 1);
        hashMap.put("Monkey", 2);
        hashMap.put("Lion", 3);
        hashMap.put("Elephant", 4);
        hashMap.put("Dog", 5);

        // Print the original HashMap
        System.out.println("Original HashMap: " + hashMap);

        // Sort the HashMap by keys using TreeMap
        TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);

        // Print the sorted HashMap
        System.out.println("Sorted HashMap by keys: " + sortedMap);
    }
}
