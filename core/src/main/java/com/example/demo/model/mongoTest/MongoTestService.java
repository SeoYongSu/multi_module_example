package com.example.demo.model.mongoTest;

import java.util.List;

public interface MongoTestService {

    void saveTest(String name);

    List<MongoTest> getAll();
}
