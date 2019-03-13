package com.demo.cloud.service.impl;

import com.demo.cloud.entity.User;
import com.demo.cloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "userHystrix")
    public User user() {
        log.info("request user-service");
        return restTemplate.getForObject("http://user-micro-service/user", User.class);
    }

    private User userHystrix() {
        log.info("userHystrix");
        return null;
    }
}
