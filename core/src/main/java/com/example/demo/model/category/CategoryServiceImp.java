package com.example.demo.model.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService{

    private final CategoryRepository repository;

    @Override
    public Category save(Category category) {
        return repository.save( category );
    }
}
