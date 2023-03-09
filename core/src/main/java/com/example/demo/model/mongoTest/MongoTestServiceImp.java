package com.example.demo.model.mongoTest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MongoTestServiceImp implements MongoTestService{

    private final MongoTestRepository repository;

    @Override
    public void saveTest(String name) {
        repository.save( new MongoTest(name));
    }

    @Override
    public List<MongoTest> getAll() {
        return repository.findAll();
    }
}
