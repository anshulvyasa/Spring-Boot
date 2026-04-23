package com.example.lecture6_aop.service;

import org.springframework.stereotype.Service;

import com.example.lecture6_aop.entity.Product;
import com.example.lecture6_aop.repository.ProductRepo;

@Service
public class ProductService {
    ProductRepo productRepo;
   
    ProductService(ProductRepo productRepo){
         this.productRepo=productRepo;
    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }

}
