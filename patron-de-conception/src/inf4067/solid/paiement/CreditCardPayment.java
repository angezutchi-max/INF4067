package inf4067.solid.paiement;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: " + amount + " CFA");
    }
}
