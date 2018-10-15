package com.demo.cloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Descirption TODO
 * @Author chao.zhang
 * @Date 2018/10/15 15:28
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
