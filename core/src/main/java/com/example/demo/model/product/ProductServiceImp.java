package com.example.demo.model.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepository repository;

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }
}
