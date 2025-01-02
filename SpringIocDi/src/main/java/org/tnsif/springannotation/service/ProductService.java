package org.tnsif.springannotation.service;

import java.util.List;

import org.tnsif.springannotation.entity.Product;

public interface ProductService {
	 public void addProduct(Product product);
	 public List<Product> getAllProducts();
}
