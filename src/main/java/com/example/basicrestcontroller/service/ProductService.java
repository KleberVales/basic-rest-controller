package com.example.basicrestcontroller.service;

import com.example.basicrestcontroller.model.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts() {
        return List.of(
                new Product("Laptop", 3500.00),
                new Product("Mouse", 150.00),
                new Product("Teclado", 250.00)
        );
    }
}
