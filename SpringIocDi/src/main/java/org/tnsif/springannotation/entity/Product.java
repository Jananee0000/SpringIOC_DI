package org.tnsif.springannotation.entity;

public class Product {
	private Long id;
    private String name;
    private double price;

    //constructor
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //Getters and Setters
    public Long getId() { 
    	return id; 
    	}
    public String getName() { 
    	return name; 
    	}
    public double getPrice() { 
    	return price; 
    	}
    
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
    

}
