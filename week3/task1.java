class Student {
    String name;
    int rollNumber;
    String branch;
    double cgpa;

    public void displayInfo() {
        System.out.println("Roll No: " + rollNumber + " | Name: " + name + " | Branch: " + branch + " | CGPA: " + cgpa);
    }
}

public class task1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice Smith";
        s1.rollNumber = 101;
        s1.branch = "Computer Science";
        s1.cgpa = 3.8;

        Student s2 = new Student();
        s2.name = "Bob Jones";
        s2.rollNumber = 102;
        s2.branch = "Electrical Engineering";
        s2.cgpa = 3.5;

        Student s3 = new Student();
        s3.name = "Charlie Brown";
        s3.rollNumber = 103;
        s3.branch = "Mechanical Engineering";
        s3.cgpa = 3.9;

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}