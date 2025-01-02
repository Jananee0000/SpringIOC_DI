package com.springone.ioc;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("productconfig.xml");
		Cart cart=ac.getBean("cart",Cart.class);
		ArrayList<Product> list=cart.getProductList();
		double total=0;
		for(Product prod:list) {
			total=total+prod.getPrice();
		}
		
System.out.println("total price: "+total);
	}

}
