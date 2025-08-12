package com.example.basicrestcontroller.controller;

import com.example.basicrestcontroller.model.Product;
import com.example.basicrestcontroller.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HelloController {

    private final ProductService productService;

    public HelloController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello from REST Controller!";
    }

    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }
}
