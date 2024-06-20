package com.dginebra.product_service;

import com.dginebra.product_service.entity.Product;
import com.dginebra.product_service.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ProductServiceApplication {


//	@Autowired
//	private ProductRepository repository;
//
//	@PostConstruct
//	public void initDB(){
//		List<Product> products = Stream.of(
//				new Product("Laptop", "Electronics", 3200f, 10),
//				new Product("Smartphone", "Electronics", 700.99f, 100),
//				new Product("Posts", "Digital Assets", 6.99f, 500),
//				new Product("Desk Table", "Furniture", 99.99f, 20),
//				new Product("Desk Lamp", "Furniture", 19.99f, 10),
//				new Product("Water Bottle", "Accessories", 499.99f, 3000)
//		).collect(Collectors.toList());
//		repository.saveAll(products);
//	}

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
