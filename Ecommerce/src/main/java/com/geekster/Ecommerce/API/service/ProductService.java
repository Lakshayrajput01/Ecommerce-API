package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.models.Product;
import com.geekster.Ecommerce.API.repositories.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public void insertProductData(List<Product> products) {
        List<Product> Add = iProductRepo.saveAll(products);
    }

    public void deleteById(Integer id) {
        iProductRepo.deleteById(id);
    }

    public List<Product> getProductByCategory(String category) {
        return iProductRepo.findByCategory(category);
    }
}
