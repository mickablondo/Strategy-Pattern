package fr.mika.test.pattern.strategy.payments;

import fr.mika.test.pattern.strategy.PaymentStrategy;

/**
 * Moyen de paiement par défaut
 *
 * @author mika
 */
public class DefaultPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paiement en monnaie de " + amount + " euros.");
    }
}