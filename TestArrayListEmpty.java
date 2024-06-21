import java.util.ArrayList;

public class TestArrayListEmpty {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Check if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add elements to the ArrayList
        list.add("Element1");
        list.add("Element2");

        // Check again if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
