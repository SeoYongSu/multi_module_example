package com.example.demo.model.mongoTest;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
public class MongoTest {

    @Id
    private String id;

    private String name;

    public MongoTest(String name){
        this.name = name;
    }
}
