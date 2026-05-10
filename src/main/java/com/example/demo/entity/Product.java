package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_tbl")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String  productNanme;
	private String  price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}  
	public String getProductNanme() {
		return productNanme;
	}
	public void setProductNanme(String productNanme) {
		this.productNanme = productNanme;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
