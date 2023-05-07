package com.geekster.Ecommerce.API.repositories;

import com.geekster.Ecommerce.API.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {

//    custom finders
    public List<Product> findByCategory(String category);
}

