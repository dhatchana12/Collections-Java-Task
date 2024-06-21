import java.util.LinkedList;

public class LinkedListInsertion {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add initial elements to the LinkedList
        list.add("HTML");
        list.add("CSS");
        list.add("JAVA");
        list.add("PHP");

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + list);

        // Element to be inserted
        String element = "JAVASCRIPT";
        // Position where the element is to be inserted (0-based index)
        int position = 2;

        // Check if the position is valid
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position");
        } else {
            // Insert the element at the specified position
            list.add(position, element);

            // Print the updated LinkedList
            System.out.println("LinkedList after insertion: " + list);
        }
    }
}
