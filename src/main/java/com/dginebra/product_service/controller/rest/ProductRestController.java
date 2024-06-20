package com.dginebra.product_service.controller;

import com.dginebra.product_service.entity.Product;
import com.dginebra.product_service.exception.ApiException;
import com.dginebra.product_service.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {
    private final IProductService productService;

    public ProductRestController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<List<Product>> findAll(@RequestParam(defaultValue = "0") Integer pageNo,
                                               @RequestParam(defaultValue = "12") Integer pageSize,
                                               @RequestParam(defaultValue = "id") String sortBy) {
        try {
            return ResponseEntity.ok().body(this.productService.getProducts(pageNo, pageSize, sortBy));
        } catch (Exception e) {
            throw new ApiException(e.getMessage(), e.getCause());
        }
    }

    @GetMapping(value = "/{category}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String category) {
        try {
            List<Product> productsByCategory = productService.getProductsByCategory(category);
            return !productsByCategory.isEmpty() ?
                    ResponseEntity.status(HttpStatus.OK).body(productsByCategory) :
                    ResponseEntity.status(HttpStatus.NOT_FOUND).body(Collections.emptyList());
        } catch (Exception e) {
            throw new ApiException(e.getMessage(), e.getCause());
        }
    }
}
