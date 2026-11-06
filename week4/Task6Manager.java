import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task6Manager {
    // HashMap stores student records (Key: Student ID, Value: Task6 Object)
    private static final Map<Integer, Task6> studentMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            try {
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear newline buffer

                switch (choice) {
                    case 1:
                        addStudent(scanner);
                        break;
                    case 2:
                        viewStudents();
                        break;
                    case 3:
                        searchStudent(scanner);
                        break;
                    case 4:
                        removeStudent(scanner);
                        break;
                    case 5:
                        displayUniqueCourses();
                        break;
                    case 6:
                        running = false;
                        System.out.println("\nExiting Student Record Manager. Goodbye!");
                        break;
                    default:
                        System.out.println("\n[Error] Invalid choice! Please select an option between 1 and 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[Error] Invalid input! Choice must be an integer.");
                scanner.nextLine(); // Clear invalid token from scanner buffer
            } catch (Exception e) {
                System.out.println("\n[Error] An unexpected exception occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n===== Student Record Manager =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Remove Student");
        System.out.println("5. Display Unique Courses");
        System.out.println("6. Exit");
    }

    private static void addStudent(Scanner scanner) {
        try {
            System.out.print("\nEnter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Clear newline buffer

            // Validates Student ID uniqueness via HashMap key check
            if (studentMap.containsKey(id)) {
                System.out.println("[Error] Student ID " + id + " already exists. IDs must be unique.");
                return;
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("[Error] Student Name cannot be empty.");
                return;
            }

            System.out.print("Enter Course: ");
            String course = scanner.nextLine().trim();
            if (course.isEmpty()) {
                System.out.println("[Error] Course name cannot be empty.");
                return;
            }

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            if (age <= 0 || age > 100) {
                System.out.println("[Error] Age must be a positive integer.");
                return;
            }

            Task6 student = new Task6(id, name, course, age);
            studentMap.put(id, student);
            System.out.println("[Success] Student added successfully!");

        } catch (InputMismatchException e) {
            System.out.println("[Error] Invalid numeric format entered for ID or Age. Transaction canceled.");
            scanner.nextLine(); // Clear bad buffer data
        }
    }

    private static void viewStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("\n[Info] No student records available to display.");
            return;
        }

        // Constructs formatted table using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("\n+--------+----------------------+-------+--------------------------+\n");
        sb.append("| ID     | Name                 | Age   | Course                   |\n");
        sb.append("+--------+----------------------+-------+--------------------------+");
        System.out.println(sb.toString());

        for (Task6 student : studentMap.values()) {
            System.out.println(student.toString());
        }

        StringBuilder footer = new StringBuilder();
        footer.append("+--------+----------------------+-------+--------------------------+\n");
        footer.append("Total Records: ").append(studentMap.size());
        System.out.println(footer.toString());
    }

    private static void searchStudent(Scanner scanner) {
        try {
            System.out.print("\nEnter Student ID to Search: ");
            int id = scanner.nextInt();

            if (studentMap.containsKey(id)) {
                Task6 student = studentMap.get(id);
                StringBuilder sb = new StringBuilder();
                sb.append("\n[Result] Student Record Found:\n")
                  .append("-----------------------------\n")
                  .append("ID     : ").append(student.getId()).append("\n")
                  .append("Name   : ").append(student.getName()).append("\n")
                  .append("Age    : ").append(student.getAge()).append("\n")
                  .append("Course : ").append(student.getCourse());
                System.out.println(sb.toString());
            } else {
                System.out.println("[Result] Student with ID " + id + " does not exist.");
            }
        } catch (InputMismatchException e) {
            System.out.println("[Error] Invalid Student ID format. Please enter an integer.");
            scanner.nextLine();
        }
    }

    private static void removeStudent(Scanner scanner) {
        try {
            System.out.print("\nEnter Student ID to Remove: ");
            int id = scanner.nextInt();

            if (studentMap.containsKey(id)) {
                Task6 removedStudent = studentMap.remove(id);
                System.out.println("[Success] Student '" + removedStudent.getName() + "' (ID: " + id + ") removed successfully.");
            } else {
                System.out.println("[Error] Removal failed: Student with ID " + id + " does not exist.");
            }
        } catch (InputMismatchException e) {
            System.out.println("[Error] Invalid Student ID format. Please enter an integer.");
            scanner.nextLine();
        }
    }

    private static void displayUniqueCourses() {
        if (studentMap.isEmpty()) {
            System.out.println("\n[Info] No student records available to extract courses.");
            return;
        }

        // Filters unique course names across all students via HashSet
        Set<String> uniqueCourses = new HashSet<>();
        for (Task6 student : studentMap.values()) {
            uniqueCourses.add(student.getCourse());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\n===== Unique Courses Offered =====\n");
        int index = 1;
        for (String course : uniqueCourses) {
            sb.append(index++).append(". ").append(course).append("\n");
        }
        sb.append("Total Unique Courses: ").append(uniqueCourses.size());
        System.out.println(sb.toString());
    }
}