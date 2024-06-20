package com.dginebra.product_service.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.dginebra.product_service.entity.Product;
import com.dginebra.product_service.service.IProductService;


@Controller
public class ProductGraphQLController {
    private final IProductService productService;

    public ProductGraphQLController(IProductService productService) {
        this.productService = productService;
    }

    @QueryMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @QueryMapping
    public List<Product> getProductsByCategory(@Argument String category) {
        return productService.getProductsByCategory(category);
    }

}
