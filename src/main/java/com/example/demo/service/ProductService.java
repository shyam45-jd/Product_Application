package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);

	public List<Product> getAll();
	
	public Product getById(Long id);
	
	public Product updateProduct(Long id,Product product);
	
	public void deleteProduct(Long id);
}
