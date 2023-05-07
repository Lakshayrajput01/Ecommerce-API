package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.models.Address;
import com.geekster.Ecommerce.API.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping(value = "/")
    public void insertAddress(@RequestBody List<Address> address){
        addressService.insertAddress(address);
    }
}
