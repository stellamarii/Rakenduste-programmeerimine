package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private CategoryType category;
}

enum CategoryType{
    PREMIUM, DELUXE, BASIC
}
