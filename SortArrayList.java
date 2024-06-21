import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Class representing a Person
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement the compareTo method to sort by name (natural ordering)
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

// Comparator to sort by age
class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}

public class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of Person objects
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Mani", 25));
        personList.add(new Person("Priya", 30));
        personList.add(new Person("Saravana", 20));
        personList.add(new Person("Hari", 35));

        // Sort using Comparable (natural ordering by name)
        Collections.sort(personList);
        System.out.println("Sorted by name (using Comparable):");
        for (Person person : personList) {
            System.out.println(person);
        }

        // Sort using Comparator (custom ordering by age)
        Collections.sort(personList, new AgeComparator());
        System.out.println("\nSorted by age (using Comparator):");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

