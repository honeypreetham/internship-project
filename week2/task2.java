public class task2 {
    public void numbers(){
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void evennumbers(){
        for(int i=2;i<=100;i=i+2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void oddnumbers(){
        for(int i=1;i<=100;i=i+2){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public int sumofnumbers(){
        int n =100;
        int s = (n*(n+1))/2;
        return s;
    }
    public static void main(String[] args){
        task2 obj = new task2();
        System.out.println("Numbers from 1 to 100:");
        obj.numbers();

        System.out.println("\nAll even numbers between 1 and 100:");
        obj.evennumbers();

        System.out.println("\nAll odd numbers between 1 and 100:");
        obj.oddnumbers();

        System.out.println("\nThe sum of numbers from 1 to 100: " + obj.sumofnumbers());
    }
}
