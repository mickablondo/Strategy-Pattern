package fr.mika.test.pattern.strategy.payments;

import fr.mika.test.pattern.strategy.PaymentStrategy;

/**
 * Logique de traitement du paiement en Bitcoin
 *
 * @author mika
 */
public class BitcoinPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Paiement en Bitcoin de " + amount + " euros.");
    }
}
