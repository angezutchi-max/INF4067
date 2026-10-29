package inf4067.solid.paiement;

// Utilisation
public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentProcessor2 processor1 = new PaymentProcessor2(creditCard);
        processor1.processPayment(10000);

        PaymentMethod paypal = new PayPalPayment();
        PaymentProcessor2 processor2 = new PaymentProcessor2(paypal);
        processor2.processPayment(5000);

        // Ajouter un mode de paiement = ajouter une classe, sans toucher au reste
        PaymentProcessor2 processor3 = new PaymentProcessor2(new MobilePayment());
        processor3.processPayment(1500);

        PaymentProcessor2 processor4 = new PaymentProcessor2(new CryptoPayment());
        processor4.processPayment(4500);
    }
}
