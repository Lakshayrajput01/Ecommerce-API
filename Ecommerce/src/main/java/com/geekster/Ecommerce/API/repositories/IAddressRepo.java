package com.geekster.Ecommerce.API.repositories;

import com.geekster.Ecommerce.API.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
