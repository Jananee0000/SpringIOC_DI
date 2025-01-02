package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PaymentMain {

	public static void main(String[] args) {
		
		/*PaymentService psOne = new CreditCardPayment();
		psOne.processPayment(1000.00);
		
		PaymentService psTwo = new GPayPayment();
		psTwo.processPayment(500.00);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("payment.xml");
        
       PaymentProcessor paymentProcessor = (PaymentProcessor) context.getBean("paymentProcessor");
        
        paymentProcessor.makePayment(1000.00);
        PaymentProcessor paymentProcessorOne = (PaymentProcessor) context.getBean("paymentProcessor");
       
        if(paymentProcessor==paymentProcessorOne) {
        	System.out.println("Two objects are equal");
        }
        
	}

}
