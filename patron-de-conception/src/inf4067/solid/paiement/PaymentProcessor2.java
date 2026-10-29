package inf4067.solid.paiement;

public class PaymentProcessor2 {
    private PaymentMethod paymentMethod;

    public PaymentProcessor2(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
