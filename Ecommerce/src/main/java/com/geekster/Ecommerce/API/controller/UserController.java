package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.models.Orders;
import com.geekster.Ecommerce.API.models.Users;
import com.geekster.Ecommerce.API.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
@Autowired
UsersService usersService;
    @PostMapping(value = "/")
    public void AddData(@RequestBody List<Users> users){
        usersService.insertData(users);
    }

    @GetMapping(value = "/byId/{id}")
    public Users getUsersById(@PathVariable Integer id){
        return usersService.getUsersById(id);
    }

}
