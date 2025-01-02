package org.tnsif.springioc;

public class PaymentProcessor {
	private PaymentService paymentService;
	String process;
	
	
    // Constructor-based  injection
    public PaymentProcessor(PaymentService paymentService, String process) {
        this.paymentService = paymentService;
        this.process=process;
        System.out.println("The constructor is injected");
    }

    public void makePayment(double amount) {
        paymentService.processPayment(amount);
    }
}
