package com.product.product.controller;

import com.product.product.entity.ProductEntity;
import com.product.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/")
    public String viewHome(Model model) {
        model.addAttribute("listProduct", productRepository.findAll());
        model.addAttribute("listProd", new ProductEntity());
        return "index";
    }
    @PostMapping("/add")
    public String addProduct(@ModelAttribute("listProd") ProductEntity productEntity) {
        productRepository.save(productEntity);
        return "redirect:/";
    }
    
}
