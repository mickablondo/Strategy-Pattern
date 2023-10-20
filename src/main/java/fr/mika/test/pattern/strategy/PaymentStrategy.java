package fr.mika.test.pattern.strategy;

/**
 * Interface permettant de définir une manière de payer
 *
 * @author mika
 */
public interface PaymentStrategy {
    void processPayment(double amount);
}
