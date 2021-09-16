package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Item;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository CategoryRepository;

    public List<Category> getCategories(){
        return Category.findAll();
    }

    public void saveCategory(Category category) {
        CategoryRepository.save(category);
    }
}
