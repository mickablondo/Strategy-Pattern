package fr.mika.test.pattern.strategy.payments;

import fr.mika.test.pattern.strategy.PaymentStrategy;

/**
 * Logique de traitement du paiement par PayPal
 *
 * @author mika
 */
public class PayPalPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Paiement via PayPal de " + amount + " euros.");
    }
}
