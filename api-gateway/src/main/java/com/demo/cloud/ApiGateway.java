package com.demo.cloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @Descirption TODO
 * @Author chao.zhang
 * @Date 2018/10/16 14:50
 */

@SpringCloudApplication
public class ApiGateway {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGateway.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
