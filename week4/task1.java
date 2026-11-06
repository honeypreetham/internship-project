
import java.util.InputMismatchException;

import java.util.Scanner;



public class task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continueCalculation = true;



        while (continueCalculation) {

            try {

                System.out.println("\n=== Safe Calculator ===");

                System.out.print("Enter first number: ");

                double num1 = scanner.nextDouble();



                System.out.print("Enter second number: ");

                double num2 = scanner.nextDouble();



                System.out.print("Choose operation (+, -, *, /, %): ");

                char operator = scanner.next().charAt(0);



                double result = 0;

                boolean validOperation = true;



                switch (operator) {

                    case '+':

                        result = num1 + num2;

                        break;

                    case '-':

                        result = num1 - num2;

                        break;

                    case '*':

                        result = num1 * num2;

                        break;

                    case '/':

                        if (num2 == 0) {

                            throw new ArithmeticException("Division by zero is not allowed.");

                        }

                        result = num1 / num2;

                        break;

                    case '%':

                        if (num2 == 0) {

                            throw new ArithmeticException("Modulus by zero is not allowed.");

                        }

                        result = num1 % num2;

                        break;

                    default:

                        System.out.println("Error: Invalid operator selected.");

                        validOperation = false;

                }



                if (validOperation) {

                    System.out.println("Result: " + result);

                }



            } catch (InputMismatchException e) {

                System.out.println("Error: Invalid input! Please enter valid numeric values.");

                scanner.nextLine(); // Clear invalid input buffer

            } catch (ArithmeticException e) {

                System.out.println("Error: " + e.getMessage());

            }



            System.out.print("\nDo you want to perform another calculation? (yes/no): ");

            String response = scanner.next();

            if (!response.equalsIgnoreCase("yes")) {

                continueCalculation = false;

            }

        }

        System.out.println("Calculator program exited safely.");

        scanner.close();

    }

}