package fr.mika.test.pattern.strategy;

import fr.mika.test.pattern.strategy.payments.BitcoinPayment;
import fr.mika.test.pattern.strategy.payments.CreditCardPayment;
import fr.mika.test.pattern.strategy.payments.DefaultPayment;
import fr.mika.test.pattern.strategy.payments.PayPalPayment;

/**
 * Classe principale qui va traiter un moyen de paiement
 * passé en argument et exécuter le process de paiement lié.
 *
 * @author mika
 */
public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        if(args == null || args.length == 0) {
            PaymentStrategy defaultPayment = new DefaultPayment();
            processor.setPaymentStrategy(defaultPayment);
            processor.processPayment(300.0);
        } else {
            switch(args[0]) {
                case "creditcard" :
                    PaymentStrategy creditCard = new CreditCardPayment();
                    processor.setPaymentStrategy(creditCard);
                    processor.processPayment(100.0);
                    break;
                case "bitcoin" :
                    PaymentStrategy bitcoin = new BitcoinPayment();
                    processor.setPaymentStrategy(bitcoin);
                    processor.processPayment(10.0);
                    break;
                case "paypal" :
                    PaymentStrategy payPal = new PayPalPayment();
                    processor.setPaymentStrategy(payPal);
                    processor.processPayment(50.0);
                    break;
                default:
                    PaymentStrategy defaultPayment = new DefaultPayment();
                    processor.setPaymentStrategy(defaultPayment);
                    processor.processPayment(40.0);
                    break;
            }
        }
    }
}