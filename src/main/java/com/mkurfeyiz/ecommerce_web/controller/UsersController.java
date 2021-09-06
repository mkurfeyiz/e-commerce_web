package com.mkurfeyiz.ecommerce_web.controller;

import com.mkurfeyiz.ecommerce_web.model.Users;
import com.mkurfeyiz.ecommerce_web.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private IUsersService usersService;

    @Autowired
    public UsersController(IUsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/getUsers")
    public List<Users> getAllUsers(){
        return this.usersService.getAllUsers();
    }

    @PostMapping("/createUser")
    public ResponseEntity<Users> createUser(@RequestBody Users user){
        if (!ObjectUtils.isEmpty(user)) {
            usersService.createUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/updateUser")
    public ResponseEntity<Users> updateUser(@RequestBody Users user){
        if (!ObjectUtils.isEmpty(user)) {
            usersService.updateUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/deleteUser")
    public ResponseEntity<Users> deleteUser(@RequestBody Users user){
        if (!ObjectUtils.isEmpty(user)) {
            usersService.deleteUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
