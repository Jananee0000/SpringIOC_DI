//Program to demonstrate configuration using annotations

package com.springannotations.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Order or= (Order)context.getBean("order");
		double price=or.calculateTotalPrice();
		or.displayOrderDetails();
		System.out.println("Total bill amount: "+price);

	}

}
