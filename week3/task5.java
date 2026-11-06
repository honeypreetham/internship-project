// Part A: Method Overloading
class Calculator5 {
    // Overloaded method 1: 2 integer parameters
    public int calculate(int a, int b) {
        return a + b;
    }

    // Overloaded method 2: 2 double parameters
    public double calculate(double a, double b) {
        return a * b;
    }

    // Overloaded method 3: 3 integer parameters
    public int calculate(int a, int b, int c) {
        return a + b + c;
    }
}

// Part B: Method Overriding
class Vehicle5 {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car5 extends Vehicle5 {
    @Override
    public void start() {
        System.out.println("Car starts with keyless push-button ignition!");
    }
}

class Bike5 extends Vehicle5 {
    @Override
    public void start() {
        System.out.println("Bike starts with a self-start button or kick start!");
    }
}

public class task5 {
    public static void main(String[] args) {
        // Part A Demonstration: Method Overloading
        System.out.println("=== Part A: Method Overloading ===");
        Calculator5 calc = new Calculator5();
        System.out.println("calculate(5, 10)       [Sum of 2 ints]       : " + calc.calculate(5, 10));
        System.out.println("calculate(4.5, 2.0)    [Product of 2 doubles]: " + calc.calculate(4.5, 2.0));
        System.out.println("calculate(3, 6, 9)     [Sum of 3 ints]       : " + calc.calculate(3, 6, 9));

        System.out.println("\n=== Part B: Method Overriding ===");
        Vehicle5 generalVehicle = new Vehicle5();
        Vehicle5 myCar = new Car5();   // Polymorphic reference
        Vehicle5 myBike = new Bike5(); // Polymorphic reference

        generalVehicle.start();
        myCar.start();
        myBike.start();
    }
}