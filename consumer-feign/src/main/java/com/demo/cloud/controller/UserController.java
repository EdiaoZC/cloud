package com.demo.cloud.controller;

import com.demo.cloud.client.UserClient;
import com.demo.cloud.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user")
    public User user() {
        log.info("feign处理请求");
        return userClient.user();
    }
}
