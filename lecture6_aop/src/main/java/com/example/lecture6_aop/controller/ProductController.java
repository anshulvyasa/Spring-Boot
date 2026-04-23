package com.example.lecture6_aop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lecture6_aop.entity.Product;
import com.example.lecture6_aop.service.ProductService;

@Controller
@RequestMapping("/api/v1")
public class ProductController {
    
    ProductService productService;

    ProductController(ProductService productService){
          this.productService=productService;
    }

    @PostMapping("/add-product")
    ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product savedProduct=productService.addProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

}
