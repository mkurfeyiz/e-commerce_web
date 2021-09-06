package com.mkurfeyiz.ecommerce_web.service;

import com.mkurfeyiz.ecommerce_web.model.Users;

import java.util.List;

public interface IUsersService {
    List<Users> getAllUsers();
    void createUser(Users user);
    void updateUser(Users user);
    void deleteUser(Users user);
}
