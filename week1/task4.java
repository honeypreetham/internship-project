import java.util.Scanner;

class Calculator {
    public int addition(int n1, int n2) {
        return n1 + n2;
    }

    public int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }

    public int modulus(int n1, int n2) {
        return n1 % n2;
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        Calculator calc = new Calculator();
        System.out.println("Addition : " + calc.addition(num1, num2));
        System.out.println("Subtraction : " + calc.subtraction(num1, num2));
        System.out.println("Multiplication : " + calc.multiplication(num1, num2));
        if (num2 != 0) {
            System.out.println("Division : " + calc.division(num1, num2));
            System.out.println("Modulus : " + calc.modulus(num1, num2));
        } else {
            System.out.println("Division and Modulus by zero are not allowed.");
        }

        sc.close();
    }
}