package com.demo.cloud.controller;


import com.demo.cloud.entity.User;
import com.demo.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;


    @GetMapping("/user")
    public User user() {
        return service.user();
    }
}
