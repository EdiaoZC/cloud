package com.demo.cloud.client.impl;

import com.demo.cloud.client.UserClient;
import com.demo.cloud.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserClientImpl implements UserClient {
    @Override
    public User user() {
        log.info("降级");
        return null;
    }
}
