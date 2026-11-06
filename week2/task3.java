import java.util.Scanner;

public class task3 {
    int n1;int n2;
    public int addition(){
        return n1+n2;
    }
    public int subtraction(){
        return n1-n2;
    }
    public int multiplication(){
        return n1*n2;
    }
    public float division(){
        return n1/n2;
    }
    public int modulus(){
        return n1%n2;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        task3 obj = new task3();
        System.out.println("Enter First Number");
        obj.n1 = sc.nextInt();
        System.out.println("Enter Second Number");
        obj.n2 = sc.nextInt();

        System.out.println("Addition "+obj.addition());
        System.out.println("Subtraction "+obj.subtraction());
        System.out.println("Multiplication "+obj.multiplication());
        System.out.println("Division "+obj.division());
        System.out.println("Modulus "+obj.modulus());

    }
}
