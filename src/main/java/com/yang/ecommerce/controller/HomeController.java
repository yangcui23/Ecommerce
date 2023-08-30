package com.yang.ecommerce.controller;

import com.yang.ecommerce.model.Category;
import com.yang.ecommerce.model.Product;
import com.yang.ecommerce.repository.CategoryRepository;
import com.yang.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/")
    public String home(Model model){
        List<Category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);
        List<Category> topCategories = categoryService.getTopCategories(); // Fetch top categories here

        model.addAttribute("topCategories", topCategories);
        System.out.println("your top cate" + topCategories);


        return "dashboard";
    }

    @GetMapping("/category/{name}")
    public String getCategoryPage( Model model, @PathVariable String name) {
        Category category = categoryRepository.findByName(name);
        if (category != null) {

            Set<Product> products = category.getProducts();
            model.addAttribute("category", category);
            model.addAttribute("products", products);
//
            return "categoryPage";
        } else {
            // Handle category not found
            System.out.println("Category not found: " + name);
            return "errorPage"; // You can create an error page template
        }
    }
}
