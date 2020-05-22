package com.codeup.dandihammocks.controllers;

import com.codeup.dandihammocks.models.Product;
import com.codeup.dandihammocks.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductsController {

    private ProductRepository productsRepo;

    public ProductsController(ProductRepository productsRepo) {
        this.productsRepo = productsRepo;
    }

    @GetMapping("/products")
    public String productsIndex(Model model) {
        List<Product> products = productsRepo.findAll();
        model.addAttribute("products", products);
        return ("productsIndex");
    }
}
