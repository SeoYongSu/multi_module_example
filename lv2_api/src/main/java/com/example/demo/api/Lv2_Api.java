package com.example.demo.api;


import com.example.demo.model.mongoTest.MongoTest;
import com.example.demo.model.mongoTest.MongoTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Lv2_Api {

    private final MongoTestService mongoTestService;

    @GetMapping("/test")
    public List<MongoTest> findAll(){
        return mongoTestService.getAll();
    }


}
