package com.example.SpringBoot_Practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Entity
@Table(name="USER")
public class UserEntity {
    @Id
    private String id;

    @Column
    private String name;
}
