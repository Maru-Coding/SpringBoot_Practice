package com.example.SpringBoot_Practice.repository;

import com.example.SpringBoot_Practice.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface TestRepository extends CrudRepository<TestEntity, Long> {
    @Override
    ArrayList<TestEntity> findAll();
}
