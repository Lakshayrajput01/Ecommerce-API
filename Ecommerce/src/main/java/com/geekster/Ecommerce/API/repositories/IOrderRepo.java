package com.geekster.Ecommerce.API.repositories;

import com.geekster.Ecommerce.API.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Orders,Integer> {

}
