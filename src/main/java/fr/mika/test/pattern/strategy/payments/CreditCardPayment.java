package fr.mika.test.pattern.strategy.payments;

import fr.mika.test.pattern.strategy.PaymentStrategy;

/**
 * Logique de traitement du paiement en carte de crédit
 *
 * @author mika
 */
public class CreditCardPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Paiement par carte de crédit de " + amount + " euros.");
    }
}
