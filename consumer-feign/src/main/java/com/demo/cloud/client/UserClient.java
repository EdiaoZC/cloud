package com.demo.cloud.client;

import com.demo.cloud.client.impl.UserClientImpl;
import com.demo.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "user-service",fallback = UserClientImpl.class)
public interface UserClient {

    @GetMapping("/user")
    User user();
}
