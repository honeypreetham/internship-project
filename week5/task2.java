// Defining the Interface
interface Payment {
    void pay(double amount);
    void showPaymentDetails();
}

// Class implementing the Interface for UPI Payments
class UPIPayment implements Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI Payment of $" + amount + " via ID: " + upiId);
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Payment Method: UPI | Linked ID: " + upiId);
    }
}

// Class implementing the Interface for Card Payments
class CardPayment implements Payment {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Card Payment of $" + amount + " via Card: " + cardNumber);
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Payment Method: Credit/Debit Card | Card No: " + cardNumber);
    }
}

// Main class to demonstrate functionality
public class task2 {
    public static void main(String[] args) {
        System.out.println("--- Task 2: Interfaces Demonstration ---");

        Payment payment1 = new UPIPayment("student@oksbi");
        Payment payment2 = new CardPayment("1234-5678-9012-3456");

        payment1.showPaymentDetails();
        payment1.pay(150.50);
        
        System.out.println();
        
        payment2.showPaymentDetails();
        payment2.pay(300.75);
    }
}