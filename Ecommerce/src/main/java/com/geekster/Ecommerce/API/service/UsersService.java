package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.models.Orders;
import com.geekster.Ecommerce.API.models.Users;
import com.geekster.Ecommerce.API.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    IUserRepo iUserRepo;

    public void insertData(List<Users> users) {
        List<Users> add = iUserRepo.saveAll(users);
    }

    public Users getUsersById(Integer id) {
        return iUserRepo.findById(id).orElse(null);
    }
}
