//Program to demonstrate configuration using annotations

package com.springannotations.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order {
	@Autowired
	private Book books;
	@Value("2")
	private int quantity;
	
	public Book getBooks() {
		return books;
	}
	public void setBooks(Book books) {
		this.books = books;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//to calculate the total price of the books 
	public double calculateTotalPrice() {
		double totalPrice=0.0;
		totalPrice=getQuantity()*books.getPrice();
		return totalPrice;
		
	}
	//to display the book details
	public void displayOrderDetails() {
		System.out.println("Invoice details..");
		System.out.println("Book Id: "+books.getBookId());
		System.out.println("Book Title: "+books.getBookTitle());
		System.out.println("Author: "+books.getBookAuthor());
		System.out.println("Quantity: "+this.quantity);
		System.out.println("Price of book: "+books.getPrice());
	}
	
}
