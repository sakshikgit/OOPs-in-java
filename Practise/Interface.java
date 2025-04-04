package Practise;

interface PaymentGateway{
    void processPayment(double amount);


}

class CreditCardPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of amount" + amount);
    }

}

class UPIPayment implements PaymentGateway{
   @Override
    public void processPayment(double amount){
    System.out.println("Processing UPI payment of amount" + amount);
 }
}






public class Interface {
    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCardPayment();
        PaymentGateway p2 = new UPIPayment();

        p1.processPayment(1500.00);
        p2.processPayment(750.00);
        
    }
    
}
