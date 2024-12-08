package com.example.SpringBoot_Practice.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class TestDto {
    private Long id;
    private String name;
    private int age;
    private String hobby;
}
