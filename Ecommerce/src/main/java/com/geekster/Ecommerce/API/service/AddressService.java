package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.models.Address;
import com.geekster.Ecommerce.API.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public void insertAddress(List<Address> address) {
        List<Address> add = iAddressRepo.saveAll(address);
    }
}
