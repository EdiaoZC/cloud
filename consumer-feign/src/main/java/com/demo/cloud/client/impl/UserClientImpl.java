package com.demo.cloud.client.impl;

import com.demo.cloud.client.UserClient;
import com.demo.cloud.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientImpl implements UserClient {
    @Override
    public User user() {
        return null;
    }
}
