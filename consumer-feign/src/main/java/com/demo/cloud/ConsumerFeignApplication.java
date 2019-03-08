package com.demo.cloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableHystrix
@EnableCircuitBreaker
@SpringCloudApplication
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConsumerFeignApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }
}
