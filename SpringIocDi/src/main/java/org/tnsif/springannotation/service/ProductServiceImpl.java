package org.tnsif.springannotation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.springannotation.entity.Product;
import org.tnsif.springannotation.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	 @Autowired // Autowiring the ProductRepository
    private  ProductRepository productRepository;

   
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }
}