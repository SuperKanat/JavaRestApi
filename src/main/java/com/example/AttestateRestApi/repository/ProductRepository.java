package com.example.AttestateRestApi.repository;

import com.example.AttestateRestApi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
