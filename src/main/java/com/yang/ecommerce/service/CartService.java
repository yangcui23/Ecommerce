package com.yang.ecommerce.service;

import com.yang.ecommerce.model.Cart;
import com.yang.ecommerce.model.Product;
import com.yang.ecommerce.model.User;
import com.yang.ecommerce.repository.CartRepository;
import com.yang.ecommerce.repository.ProductRepository;
import com.yang.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {
    private final CartRepository cartRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    @Autowired
    public CartService(CartRepository cartRepository, UserRepository userRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public void addProductToCart(String email, Long productId) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        Product product = productRepository.findById(productId).orElse(null);

        if (userOptional.isPresent() && product != null) {
            User user = userOptional.get();
            Cart cart = user.getCart();
            if (cart == null) {
                cart = new Cart();
                cart.setUser(user);
            }

            List<Product> products = cart.getProducts();
            products.add(product);

            cartRepository.save(cart);
        }
    }

    public void removeProductFromCart(String email, Long productId) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        Product product = productRepository.findById(productId).orElse(null);

        if (userOptional.isPresent() && product != null) {
            User user = userOptional.get();
            Cart cart = user.getCart();

            if (cart != null) {
                List<Product> products = cart.getProducts();
                products.remove(product);

                cartRepository.save(cart);
            }
        }
    }
}
