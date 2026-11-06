// Parent Class
class Employee4 {
    String name;
    int empId;
    double salary;

    public Employee4(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void displayBaseDetails() {
        System.out.println("ID     : " + empId);
        System.out.println("Name   : " + name);
        System.out.println("Salary : $" + salary);
    }
}

// Child Class 1
class Developer4 extends Employee4 {
    String primaryLanguage;

    public Developer4(String name, int empId, double salary, String primaryLanguage) {
        super(name, empId, salary);
        this.primaryLanguage = primaryLanguage;
    }

    public void displayDeveloperDetails() {
        displayBaseDetails();
        System.out.println("Role    : Developer");
        System.out.println("Language: " + primaryLanguage);
        System.out.println("----------------------------------");
    }
}

// Child Class 2
class Manager4 extends Employee4 {
    int teamSize;

    public Manager4(String name, int empId, double salary, int teamSize) {
        super(name, empId, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        displayBaseDetails();
        System.out.println("Role     : Manager");
        System.out.println("Team Size: " + teamSize + " members");
        System.out.println("----------------------------------");
    }
}

public class task4 {
    public static void main(String[] args) {
        Developer4 dev = new Developer4("Neha Gupta", 301, 92000.0, "Java / Spring Boot");
        Manager4 mgr = new Manager4("Rajesh Khanna", 101, 125000.0, 12);

        System.out.println("=== Employee Management System ===");
        dev.displayDeveloperDetails();
        mgr.displayManagerDetails();
    }
}