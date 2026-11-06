import java.util.Scanner;

class task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer ");
        int intval = sc.nextInt();
        System.out.println("Enter Float ");
        float floatval = sc.nextFloat();
        System.out.println("Enter Double ");
        double doubleval = sc.nextDouble();
        System.out.println("Before implicit casting");
        System.out.println("Integer : " +intval);
        System.out.println("Float : " +floatval);
        System.out.println("Double : " +doubleval);

        double inttodouble = intval;
        double floattodouble = floatval;

        System.out.println("After implicit casting");
        System.out.println("Integer to Double : "+inttodouble);
        System.out.println("Float to Double  : "+floattodouble);

        byte inttobyte = (byte)intval;
        int doubletoint = (int) doubleval;
        int floattoint = (int) floatval;
        System.out.println("After explicit casting");
        System.out.println("Integer to Byte   : " + inttobyte);
        System.out.println("Double to Integer : " + doubletoint);
        System.out.println("Float to Integer  : " + floattoint);






    }
}
