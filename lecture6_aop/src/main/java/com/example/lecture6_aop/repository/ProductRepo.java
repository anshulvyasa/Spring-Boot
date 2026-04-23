package com.example.lecture6_aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lecture6_aop.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
