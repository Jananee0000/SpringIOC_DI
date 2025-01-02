package org.tnsif.springannotation.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.tnsif.springannotation.entity.Product;
import org.tnsif.springannotation.service.ProductService;

public class Application {

	public static void main(String[] args) {
		 // Create the application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the ProductService bean
        ProductService productService = context.getBean(ProductService.class);

        // Adding products directly
        productService.addProduct(new Product(1L, "Laptop", 45000.00));
        productService.addProduct(new Product(2L, "Smartphone", 30000.00));

      
        System.out.println("All Products:");
     // Step 1: Retrieve all products
        List<Product> products = productService.getAllProducts();

        // Step 2: Iterate over the products and print their details
        products.forEach(product ->
            System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: ₹" + product.getPrice()));
}
	
}


