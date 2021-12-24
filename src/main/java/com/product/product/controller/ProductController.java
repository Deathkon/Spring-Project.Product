package com.product.product.controller;

import com.product.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/")
    public String viewHome(Model model) {
        model.addAttribute("listProduct", productRepository.findAll());
        return "index";
    }
    
}
