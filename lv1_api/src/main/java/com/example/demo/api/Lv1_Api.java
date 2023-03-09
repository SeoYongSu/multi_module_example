package com.example.demo.api;


import com.example.demo.model.categoryProduct.CategoryProductService;
import com.example.demo.model.categoryProduct.dto.CategoryProduct;
import com.example.demo.model.product.Product;
import com.example.demo.model.mongoTest.MongoTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class Lv1_Api {


    private final MongoTestService mongoTestService;


    @GetMapping("/save/{name}")
    public void setMongoTest(@PathVariable("name") String name){
        mongoTestService.saveTest(name);
    }


    private final CategoryProductService categoryProductService;

    @PostMapping("/categoryData")
    public Product categorydatasave(@RequestBody CategoryProduct dto){
        return categoryProductService.save(dto);
    }

}
