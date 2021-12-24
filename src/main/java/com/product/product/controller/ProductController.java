package com.product.product.controller;

import com.product.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    
}
