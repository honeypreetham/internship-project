import java.util.Scanner;
class task1{
    String studentname;
    int subject1;
    int subject2;
    int subject3;
    public int totalmarks(){
        return subject1+subject2+subject3;
    }
    public float percentage(){
        return (totalmarks()/300.0f)*100;
    }
    public String result(){
        float pct = percentage();
        if (pct >= 90){
            return "Outstanding";
        }
        else if(pct >= 60){
           return "Pass";
        }
        else{
            return "Fail";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        task1 obj = new task1();
        System.out.println("Enter Student Name");
        obj.studentname = sc.nextLine();
        System.out.println("Enter Subject 1 Marks");
        obj.subject1 = sc.nextInt();
        System.out.println("Enter Subject 2 Marks");
        obj.subject2 = sc.nextInt();
        System.out.println("Enter Subject 3 Marks");
        obj.subject3 = sc.nextInt();
        System.out.println("Student Name : " + obj.studentname);
        System.out.println("Total Marks : "+ obj.totalmarks()+" out of 300");
        System.out.println("Percentage : "+ obj.percentage()+ "%");
        System.out.println("Result : "+ obj.result());
        sc.close();
    }
}
