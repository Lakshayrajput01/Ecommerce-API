package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.models.Orders;
import com.geekster.Ecommerce.API.repositories.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public void AddData(Orders orders) {
        iOrderRepo.save(orders);
    }

    public Orders getOrdersById(Integer id)  {
      return iOrderRepo.findById(id).orElse(null);

    }
}
