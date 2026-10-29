package inf4067.solid.paiement;

public class MobilePayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing mobile payment: " + amount + " CFA");
    }
}
