package com.aurelienana.reactspringboot.controller;

import com.aurelienana.reactspringboot.model.User;
import com.aurelienana.reactspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {

       userService.registerUser(user);

       return "User successfully registered";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }
}
