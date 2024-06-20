package com.dginebra.product_service.service;

import com.dginebra.product_service.entity.Product;
import com.dginebra.product_service.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    private final ProductRepository repository;


    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getProducts(Integer pageNo, Integer pageSize, String sortBy){
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Page<Product> pageResult = repository.findAll(paging);
        return pageResult.hasContent() ? pageResult.getContent() : new ArrayList<>();
    }

    public List<Product> getProductsByCategory(String category) {
        return repository.findByCategory(category);
    }

    //sales team : update the stock of a product in (IS)
    public Product updateStock(int id, int stock){

        Product existingProduct= repository.findById(id)
                .orElseThrow(()-> new RuntimeException("product not found with id "+id));

        existingProduct.setStock(stock);
        return repository.save(existingProduct);
    }

    //warehouse : receive new shipment
    public Product receiveNewShipment(int id, int quantity){

        Product existingProduct= repository.findById(id)
                .orElseThrow(()-> new RuntimeException("product not found with id "+id));

        existingProduct.setStock(existingProduct.getStock()+quantity);
        return repository.save(existingProduct);
    }
}
