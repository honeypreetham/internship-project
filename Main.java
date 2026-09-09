import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean running = true;

        System.out.println("Welcome to the Student Management System");

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search Record");
            System.out.println("4. Update Record");
            System.out.println("5. Delete Record");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");

            int choice = -1;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Course: ");
                        String course = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter Marks: ");
                        double marks = scanner.nextDouble();
                        
                        manager.addRecord(new Student(id, name, course, age, marks));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input format. Age and Marks must be numbers.");
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    manager.viewAllRecords();
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    manager.searchRecord(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Student ID to update: ");
                    manager.updateRecord(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    manager.deleteRecord(scanner.nextLine());
                    break;
                case 6:
                    System.out.println("Initiating shutdown sequence...");
                    // Multithreading: Backup data asynchronously before exiting
                    Thread backupThread = new Thread(() -> {
                        System.out.println("[Background Thread] Saving database to file...");
                        manager.saveToFile();
                        System.out.println("[Background Thread] Save complete.");
                    });
                    
                    backupThread.start();
                    
                    try {
                        backupThread.join(); // Wait for backup to finish
                    } catch (InterruptedException e) {
                        System.out.println("Backup interrupted!");
                    }
                    
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}