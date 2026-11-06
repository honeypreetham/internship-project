// Abstract Class
abstract class Shape {
    // Normal method
    public void displayMessage() {
        System.out.println("Calculating the area of the shape...");
    }

    // Abstract method
    public abstract double calculateArea();
}

// Child Class 1
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Child Class 2
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to demonstrate functionality
public class task3 {
    public static void main(String[] args) {
        System.out.println("--- Task 3: Abstract Classes Demonstration ---");

        Shape myCircle = new Circle(5.0);
        myCircle.displayMessage();
        System.out.println("Area of Circle: " + String.format("%.2f", myCircle.calculateArea()));
        
        System.out.println();

        Shape myRectangle = new Rectangle(4.0, 6.0);
        myRectangle.displayMessage();
        System.out.println("Area of Rectangle: " + myRectangle.calculateArea());
    }
}