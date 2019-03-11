package com.demo.cloud.controller;

import com.demo.cloud.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Slf4j
@RestController
public class UserController {


    @GetMapping("/user")
    public User user() {
        log.info("user-service 处理请求");
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return User.builder().id(100L).name("Edios").build();
    }
}
