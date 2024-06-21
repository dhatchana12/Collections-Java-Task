import java.util.HashSet;
import java.util.ArrayList;

public class HashSetToArrayList {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Bannana");
        hashSet.add("Grapes");
        hashSet.add("Mango");

        // Convert HashSet to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(hashSet);

        // Print the resulting ArrayList
        System.out.println("Converted ArrayList: " + arrayList);
    }
}
