import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Full Name : ");
        String name = sc.nextLine();

        System.out.print("Age : ");
        int age = sc.nextInt();
        sc.nextLine(); // Clear buffer

        System.out.print("College Name : ");
        String college = sc.nextLine();

        System.out.print("Branch : ");
        String branch = sc.nextLine();

        System.out.print("City : ");
        String city = sc.nextLine();

        // Output printed line by line
        System.out.println("Full Name    : " + name);
        System.out.println("Age          : " + age);
        System.out.println("College Name : " + college);
        System.out.println("Branch       : " + branch);
        System.out.println("City         : " + city);

        sc.close();
    }
}