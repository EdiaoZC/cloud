package com.demo.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MovieMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieMicroServiceApplication.class, args);
    }
}
