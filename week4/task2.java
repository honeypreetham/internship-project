import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        // 1. Create a suitable Collection to store student names
        List<String> studentNames = new ArrayList<>();

        // 2. Add at least 5 student names
        studentNames.add("Aarav");
        studentNames.add("Priya");
        studentNames.add("Rohan");
        studentNames.add("Sneha");
        studentNames.add("Vikram");

        // 3. Display all student names
        System.out.println("--- Initial Student List ---");
        System.out.println(studentNames);

        // 4. Remove a student
        String studentToRemove = "Rohan";
        studentNames.remove(studentToRemove);
        System.out.println("\nAction: Removed '" + studentToRemove + "' from the list.");

        // 5. Search for a particular student
        String searchName = "Sneha";
        System.out.println("\nAction: Searching for '" + searchName + "'...");
        if (studentNames.contains(searchName)) {
            System.out.println("Result: " + searchName + " is present in the collection.");
        } else {
            System.out.println("Result: " + searchName + " was not found.");
        }

        // 6. Display the final collection
        System.out.println("\n--- Final Student List ---");
        System.out.println(studentNames);
    }
}