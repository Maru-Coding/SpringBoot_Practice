package com.example.SpringBoot_Practice.controller;

import com.example.SpringBoot_Practice.entity.TestEntity;
import com.example.SpringBoot_Practice.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
public class TestController {
    @Autowired
    private TestRepository testRepository;

    @GetMapping("/test")
    public String show(Model model){
        List<TestEntity> testEntityList = testRepository.findAll();
        log.info(testEntityList.toString());

        model.addAttribute("testList", testEntityList);

        return "test";
    }

}
