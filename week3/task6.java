// Encapsulation Demonstration
class BankAccount6 {
    private int acnum;
    private String hname;
    private int bal;

    public BankAccount6(int n, String na, int ba) {
        this.acnum = n;
        this.hname = na;
        this.bal = ba;
    }

    // Getter and Setter Methods
    public int getAcnum() { return acnum; }
    public String getHname() { return hname; }
    public int getBal() { return bal; }

    public void setBal(int bal) {
        if (bal >= 0) {
            this.bal = bal;
        }
    }

    public void acdetails() {
        System.out.println("Acc No: " + acnum + " | Name: " + hname + " | Balance: $" + bal);
    }
}

// Abstraction Demonstration
abstract class Account6 {
    public abstract void abs();

    public void ac() {
        System.out.println("Normal Method: Executing base account check...");
    }
}

class Concrete6 extends Account6 {
    @Override
    public void abs() {
        System.out.println("Abstract Method: Executed custom implementation!");
    }
}

public class task6 {
    public static void main(String[] args) {
        System.out.println("=== Encapsulation Demo ===");
        BankAccount6 obj1 = new BankAccount6(123, "Ram", 100);
        BankAccount6 obj2 = new BankAccount6(456, "Ramu", 500);

        obj1.acdetails();
        obj2.acdetails();

        obj1.setBal(250);
        System.out.println("Ram's Updated Balance (via getter): $" + obj1.getBal());

        System.out.println("\n=== Abstraction Demo ===");
        Concrete6 obj3 = new Concrete6();
        obj3.ac();
        obj3.abs();
    }
}