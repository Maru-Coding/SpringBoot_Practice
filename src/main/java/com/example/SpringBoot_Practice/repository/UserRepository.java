package com.example.SpringBoot_Practice.repository;

import com.example.SpringBoot_Practice.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository extends CrudRepository<UserEntity, String> {
    @Override
    ArrayList<UserEntity> findAll();
}
