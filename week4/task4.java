import java.util.HashMap;
import java.util.Map;

public class task4 {
    public static void main(String[] args) {
        // Create HashMap with Key: Student ID (Integer), Value: Student Name (String)
        Map<Integer, String> studentRecords = new HashMap<>();

        // 1. Add 5 student records
        studentRecords.put(101, "Ananya Sharma");
        studentRecords.put(102, "Rohan Verma");
        studentRecords.put(103, "Siddharth Rao");
        studentRecords.put(104, "Kavya Patel");
        studentRecords.put(105, "Dev Malik");

        // 2. Display all records
        System.out.println("--- All Student Records ---");
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }

        // 3. Search for a student using Student ID
        int searchId = 103;
        System.out.println("\n--- Search Student by ID ---");
        System.out.println("Searching for Student ID: " + searchId);
        if (studentRecords.containsKey(searchId)) {
            System.out.println("Result: Found! Name = " + studentRecords.get(searchId));
        } else {
            System.out.println("Result: Student ID " + searchId + " not found.");
        }

        // 4. Remove a student record
        int removeId = 102;
        System.out.println("\n--- Remove Student Record ---");
        if (studentRecords.containsKey(removeId)) {
            String removedName = studentRecords.remove(removeId);
            System.out.println("Success: Removed Student ID " + removeId + " (" + removedName + ")");
        } else {
            System.out.println("Error: Student ID " + removeId + " does not exist.");
        }

        // 5. Display the updated records
        System.out.println("\n--- Updated Student Records ---");
        for (Map.Entry<Integer, String> entry : studentRecords.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}