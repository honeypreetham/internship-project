public class Student extends Person {
    private static final long serialVersionUID = 1L;
    private String studentId;
    private String course;
    private double marks;

    public Student(String studentId, String name, String course, int age, double marks) {
        super(name, age); // Calling parent class constructor
        this.studentId = studentId;
        this.course = course;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Polymorphism: Overriding the abstract method
    @Override
    public void displayDetails() {
        System.out.println("ID: " + studentId + " | Name: " + getName() + " | Age: " + getAge() + " | Course: " + course + " | Marks: " + marks);
    }
    
    @Override
    public String toString() {
        return "ID: " + studentId + ", Name: " + getName();
    }
}