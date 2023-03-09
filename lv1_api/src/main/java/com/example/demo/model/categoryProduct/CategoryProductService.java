package com.example.demo.model.categoryProduct;

import com.example.demo.model.category.Category;
import com.example.demo.model.category.CategoryService;
import com.example.demo.model.categoryProduct.dto.CategoryProduct;
import com.example.demo.model.product.Product;
import com.example.demo.model.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryProductService {

    private final CategoryService categoryService;
    private final ProductService productService;


    public Product save(CategoryProduct dto){
        Category category = categoryService.save( Category.builder().categoryName(dto.getCategoryName()).build() );

        Product product = Product.builder()
                .categoryId(category.getId())
                .productName(dto.getProductName())
                .build();

        return productService.save(product);

    }

}
