package com.example.SpringBoot_Practice.controller;

import com.example.SpringBoot_Practice.entity.TestEntity;
import com.example.SpringBoot_Practice.repository.TestRepository;
import com.example.SpringBoot_Practice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Slf4j
@Controller
public class TestController {
    @Autowired
    private TestRepository testRepository;

    @Autowired
    private UserRepository userRepository;

    // 로그인 페이지
    @GetMapping("/")
    public String login(){
        return "page/login";
    }

    // 로그인 성공/실패여부 반환
    @PostMapping("/loginResult")
    public String loginResult(){
        // 로그인 실패 시

        // 로그인 성공 시
        return "redirect:/main";
    }

    // 회원가입 페이지
    @GetMapping("/register")
    public String register(){
        return "page/register";
    }

    // 회원가입 성공/실패여부 반환
    @PostMapping("/registerResult")
    public String registerResult(){
        // 회원가입 실패 시

        // 회원가입 성공 시
        return "redirect:/";
    }

    // 메인 페이지
    @GetMapping("/main")
    public String mainPage(Model model){
        List<TestEntity> testEntityList = testRepository.findAll();
        log.info(testEntityList.toString());

        model.addAttribute("testList", testEntityList);

        return "page/main";
    }
}
