package com.demo.cloud.controller;

import com.demo.cloud.client.UserClient;
import com.demo.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user")
    public User user(){
        return userClient.user();
    }
}
