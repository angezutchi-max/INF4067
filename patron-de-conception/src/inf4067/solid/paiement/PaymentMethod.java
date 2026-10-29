package inf4067.solid.paiement;

// Interface commune pour tous les moyens de paiement
public interface PaymentMethod {
    void processPayment(double amount);
}
