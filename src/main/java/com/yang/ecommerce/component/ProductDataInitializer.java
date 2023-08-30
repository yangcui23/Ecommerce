package com.yang.ecommerce.component;

import com.yang.ecommerce.model.Category;
import com.yang.ecommerce.model.Product;
import com.yang.ecommerce.repository.CategoryRepository;
import com.yang.ecommerce.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDataInitializer {

    private final CategoryRepository categoryRepository;

    @Autowired
    public ProductDataInitializer(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
    }
    @PostConstruct
    public void init() {
//        Category TV  = categoryRepository.findByName("TV");
//        Category iphone = categoryRepository.findByName("iPhone");

//        Product iphone11 = new Product();
//        iphone11.setName("iPhone 11");
//        iphone11.setDescription("Apple iPhone 11th generation");
//        iphone11.setPrice(899.99);
//        iphone11.getCategories().add(iphone);
//        productRepository.save(iphone11);


        // Add more products and assign them to categories
    }

}
