package com.springxml.app;

public class InvalidCaratException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidCaratException() {
		super("Invalid Carat");
	}

	InvalidCaratException(String message) {
		super(message);
	}

}
