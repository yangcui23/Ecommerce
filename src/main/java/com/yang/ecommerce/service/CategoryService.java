package com.yang.ecommerce.service;

import com.yang.ecommerce.model.Category;
import com.yang.ecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getTopCategories() {
        return categoryRepository.findByTopCategory(true);
    }
}
