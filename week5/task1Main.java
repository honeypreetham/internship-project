import studentmanagement.task1;

public class task1Main {
    public static void main(String[] args) {
        System.out.println("--- Task 1: Packages Demonstration ---");
        
        // Creating a Student object from the imported package
        task1 student1 = new task1(101, "Visthri Preetham", "Computer Science Engineering");
        
        // Displaying student information
        student1.displayStudentInfo();
    }
}
