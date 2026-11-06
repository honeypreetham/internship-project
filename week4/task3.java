import java.util.HashSet;
import java.util.Set;

public class task3 {
    public static void main(String[] args) {
        // Create a HashSet to store course names
        Set<String> courses = new HashSet<>();

        // 1. Add 7 course entries (including duplicate course names)
        courses.add("Java Programming");
        courses.add("Python for Data Science");
        courses.add("Web Development");
        courses.add("Java Programming"); // Duplicate 1
        courses.add("Machine Learning");
        courses.add("Cloud Computing");
        courses.add("Web Development");  // Duplicate 2

        // 2. Display the final HashSet & show element count
        System.out.println("--- Final Course HashSet ---");
        System.out.println("Total course entries added: 7");
        System.out.println("Total unique entries stored: " + courses.size());
        System.out.println("\nStored Courses in HashSet:");
        for (String course : courses) {
            System.out.println("- " + course);
        }

        // 3. Demonstrate duplicate rejection using the add() return value
        System.out.println("\n--- Duplicate Rejection Demonstration ---");
        boolean isAddedAgain = courses.add("Java Programming");
        System.out.println("Attempting to insert existing course 'Java Programming' again...");
        System.out.println("Result of add(): " + isAddedAgain + " (false indicates duplicate was rejected)");

        // 4. Search for a particular course
        String searchCourse = "Machine Learning";
        System.out.println("\n--- Course Search ---");
        System.out.println("Searching for course: '" + searchCourse + "'");
        if (courses.contains(searchCourse)) {
            System.out.println("Result: Found! '" + searchCourse + "' is currently in the set.");
        } else {
            System.out.println("Result: Not Found! '" + searchCourse + "' is not in the set.");
        }
    }
}