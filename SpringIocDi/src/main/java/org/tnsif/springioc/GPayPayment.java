package org.tnsif.springioc;

public class GPayPayment implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing GPay payment of $" + amount);
    }
}