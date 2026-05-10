package com.example.demo.seviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
@Service
public class ProductServiceimpl implements ProductService {
	@Autowired
	private ProductRepository repo;

	@Override
	public Product saveProduct(Product product) {

		return repo.save(product);
	}

	@Override
	public List<Product> getAll() {
		
		return repo.findAll();
	}    

	@Override
	public Product getById(Long id) {
		
		return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
	}

	@Override
	public Product updateProduct(Long id, Product newRecord) {
		Product existingRecord = getById(id);
		existingRecord.setProductNanme(newRecord.getProductNanme());
		existingRecord.setPrice(newRecord.getPrice());
		return repo.save(existingRecord);
	}

	@Override
	public void deleteProduct(Long id) {
		repo.deleteById(id);
		
	}
	
}

