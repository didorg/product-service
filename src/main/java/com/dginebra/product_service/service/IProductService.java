package com.dginebra.product_service.service;

import com.dginebra.product_service.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProducts(Integer pageNo, Integer pageSize, String sortBy);
    List<Product> getProductsByCategory(String category);
}
