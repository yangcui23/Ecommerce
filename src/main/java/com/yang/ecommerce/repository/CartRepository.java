package com.yang.ecommerce.repository;

import com.yang.ecommerce.model.Cart;
import com.yang.ecommerce.model.Product;
import com.yang.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(Optional<User> user);
    List<Cart> findByProducts(Product product);
}
