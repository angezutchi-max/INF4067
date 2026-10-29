package inf4067.solid.paiement;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: " + amount + " CFA");
    }
}
