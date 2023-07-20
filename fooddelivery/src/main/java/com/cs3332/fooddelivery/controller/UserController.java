package com.cs3332.fooddelivery.controller;

import com.cs3332.fooddelivery.model.user;
import com.cs3332.fooddelivery.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<user> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public user createUser(@RequestBody user user) {
        return userService.createUser(user);
    }

    // Add other endpoints as needed
}
