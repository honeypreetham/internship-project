class BankAccount{
    static int noac = 0;
    String acname;
    int acnum;
    int acbal;
    public BankAccount(String name,int num,int bal){
        this.acname=name;
        this.acnum=num;
        this.acbal=bal;
        noac++;
    }
    public void showdetails(){
        System.out.println("- Account Holder Name : "+acname);
        System.out.println("- Account Number      : "+acnum);
        System.out.println("- Balance             : "+acbal);
        System.out.println("---------------------------------"); 
    }
}

public class task3 {
    public static void main(String[] args){
        BankAccount obj1 = new BankAccount("Ram",123456, 200);
        BankAccount obj2 = new BankAccount("Ramu",123457, 500);
        BankAccount obj3 = new BankAccount("Ramin",123458, 700);
        System.out.println("Account details");

        obj1.showdetails();
        obj2.showdetails();
        obj3.showdetails();
        System.out.println("Total Bank Accounts: " + BankAccount.noac);
    }


}
