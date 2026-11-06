import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3]; // Fixed allocation syntax
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 9 numbers for the 3x3 matrix:");

        // 1. Take input using 0-based indexing (0 to 2)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.println("\n--- 3x3 Matrix Output ---");

        // 2. Print matrix using nested loops
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
        System.out.println("\nSum of all elements in the matrix: " + sum);
        sc.close();
    }
}