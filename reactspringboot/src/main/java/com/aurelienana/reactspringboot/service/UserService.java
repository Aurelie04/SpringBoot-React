package com.aurelienana.reactspringboot.service;

import com.aurelienana.reactspringboot.model.User;

import java.util.List;

public interface UserService {

    public User registerUser(User user);
    public List<User> getAllUser();
}
