import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        // 1. Input marks from user
        System.out.println("--- Enter Marks for 5 Students ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Initialize variables for calculations using first element
        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];

        // 2. Display all marks and calculate total, highest, and lowest
        System.out.println("\n--- All Student Marks ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
            
            total += marks[i]; // Accumulate total

            if (marks[i] > highest) {
                highest = marks[i]; // Update highest mark
            }
            if (marks[i] < lowest) {
                lowest = marks[i]; // Update lowest mark
            }
        }

        // 3. Calculate average
        double average = (double) total / marks.length;

        // 4. Display results
        System.out.println("\n--- Summary Performance ---");
        System.out.println("Total Marks   : " + total);
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}