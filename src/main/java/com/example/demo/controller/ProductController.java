package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	@Autowired
	private ProductService service;

	// create/save
                                                                     
	@PostMapping(value = "/save")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);

	}

	// getAll product
	@GetMapping("/getAll")
	public List<Product> getAll() {
		return service.getAll();

	}

	// getbyid
	@GetMapping("/getByid/{id}")
	public Product getById(@PathVariable Long id) {
		return service.getById(id);

	}

	// update
	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product newRecord) {
		return service.updateProduct(id, newRecord);

	}
	
	//delete
	@DeleteMapping("/delete/{id}")
	public String deleteproduct(@PathVariable Long id) {
		service.deleteProduct(id);
		return "Product delete sucessfilly"+id;
		
	}
}
