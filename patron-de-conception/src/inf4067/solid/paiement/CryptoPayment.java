package inf4067.solid.paiement;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing crypto payment: " + amount + " CFA");
    }
}
