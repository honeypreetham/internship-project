import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class StudentManager implements Manageable {
    // HashMap Collection to store students for fast lookup
    private HashMap<String, Student> studentDatabase;
    private static final String FILE_NAME = "students_data.dat"; // static keyword

    public StudentManager() {
        studentDatabase = new HashMap<>();
        loadFromFile();
    }

    @Override
    public void addRecord(Student student) {
        if (studentDatabase.containsKey(student.getStudentId())) {
            System.out.println("Error: Student ID already exists!");
        } else {
            studentDatabase.put(student.getStudentId(), student);
            System.out.println("Student added successfully.");
        }
    }

    @Override
    public void viewAllRecords() {
        if (studentDatabase.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- All Students ---");
        for (Student s : studentDatabase.values()) {
            s.displayDetails();
        }
    }

    @Override
    public void searchRecord(String id) {
        try {
            Student s = findStudentById(id);
            System.out.println("\nRecord Found:");
            s.displayDetails();
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void updateRecord(String id) {
        try {
            Student s = findStudentById(id);
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter New Course (or press enter to skip): ");
            String newCourse = sc.nextLine();
            if (!newCourse.isEmpty()) s.setCourse(newCourse);

            System.out.print("Enter New Marks (or -1 to skip): ");
            double newMarks = sc.nextDouble();
            if (newMarks != -1) s.setMarks(newMarks);

            System.out.println("Record updated successfully!");
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input during update.");
        }
    }

    @Override
    public void deleteRecord(String id) {
        if (studentDatabase.remove(id) != null) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Error: Student ID not found.");
        }
    }

    // Helper method that throws a custom exception
    private Student findStudentById(String id) throws StudentNotFoundException {
        Student s = studentDatabase.get(id);
        if (s == null) {
            throw new StudentNotFoundException("Student with ID " + id + " does not exist.");
        }
        return s;
    }

    // File Handling: Save Data
    public synchronized void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(studentDatabase);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    // File Handling: Load Data
    @SuppressWarnings("unchecked")
    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                studentDatabase = (HashMap<String, Student>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading data. Starting fresh.");
            }
        }
    }
}