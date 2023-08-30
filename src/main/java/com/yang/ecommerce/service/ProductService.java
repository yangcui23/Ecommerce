package com.yang.ecommerce.service;

import com.yang.ecommerce.model.Product;
import com.yang.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final CartService cartService;
    @Autowired
    public ProductService(ProductRepository productRepository, CartService cartService) {
        this.productRepository = productRepository;
        this.cartService = cartService;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void addProductToCart(String email, Long productId) {
        cartService.addProductToCart(email, productId);
    }

    public void removeProductFromCart(String email, Long productId) {
        cartService.removeProductFromCart(email, productId);
    }
    public List<Product> searchProductsByName(String keyword) {
        return productRepository.findByNameContainingIgnoreCase(keyword);
    }
}
