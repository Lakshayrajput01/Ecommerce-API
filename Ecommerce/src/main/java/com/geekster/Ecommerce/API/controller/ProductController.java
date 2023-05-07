package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.models.Product;
import com.geekster.Ecommerce.API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping(value = "/")
    public void AddData(@RequestBody List<Product> products){
        productService.insertProductData(products);
    }
    @DeleteMapping(value = "/byId/{id}")
    public void deleteByProductById(@PathVariable Integer id){
        productService.deleteById(id);
    }

    @GetMapping(value = "/getProductsByCategory{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }
}
