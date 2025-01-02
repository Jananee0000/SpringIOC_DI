
//Program to demonstrate setter based injection using XML Configuration

package com.springxml.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GoldRateInfoMain {

	public static GoldRateInfo loadGoldRateDetails() {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("beansTwo.xml");
		GoldRateInfo obj = (GoldRateInfo) ac.getBean("rateInfoObj");
		return obj;
	}

	public static void main(String[] args) {

		// Getting carat and total grams from user

		try (Scanner sc = new Scanner(System.in);) {

			while (true) {
				

				try {
					System.out.println("Enter the carat");

					int carat = sc.nextInt();
					sc.nextLine();

					GoldRateInfo goldRateInfo = GoldRateInfoMain.loadGoldRateDetails();
					System.out.println("Enter the no.of grams");
					int grams = sc.nextInt();
					sc.nextLine();
					double price;

					price = goldRateInfo.calculateGoldRate(carat, grams);
					System.out.println("Total gold price: " + price);
					break;
				}catch (InvalidCaratException ex) {
					System.err.println(ex.getMessage());
				}catch(Exception ex) {
					System.err.println("Invalid data!, Enter the correct value of carat or grams");
					sc.nextLine();
				}

			}

		}

	}
}