package org.tnsif.springannotation.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.tnsif.springannotation.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

	
}