package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.models.Orders;
import com.geekster.Ecommerce.API.service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(value = "/")
    public void AddData(@RequestBody Orders Orders) {
        orderService.AddData(Orders);
    }

    @GetMapping(value = "/byId/{id}")
        public Orders getOrdersById(@PathVariable Integer id){
        return orderService.getOrdersById(id);
        }


    }

//7. Get all products
//    - Get products based on category (query params)
//8. delete products based on product id.


