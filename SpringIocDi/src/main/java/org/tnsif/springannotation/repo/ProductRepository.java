package org.tnsif.springannotation.repo;

import java.util.List;

import org.tnsif.springannotation.entity.Product;

public interface ProductRepository {
	public void save(Product product);
    public List<Product> getAll();
}
