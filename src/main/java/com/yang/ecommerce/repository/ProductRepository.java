package com.yang.ecommerce.repository;

import com.yang.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product ,Long> {

    List<Product> findByNameContainingIgnoreCase(String keyword);
}
