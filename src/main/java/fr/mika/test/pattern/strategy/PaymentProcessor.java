package fr.mika.test.pattern.strategy;

/**
 * Orchestration des paiements en exécutant les méthodes
 * de la stratégie passée en paramètre
 *
 * @author mika
 */
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.processPayment(amount);
        } else {
            System.out.println("Veuillez définir une stratégie de paiement.");
        }
    }
}