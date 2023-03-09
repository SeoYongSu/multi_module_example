package com.example.demo.model.product;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Builder
@Data
public class Product {

    @Id
    private String id;

    private String categoryId;

    private String productName;


}
