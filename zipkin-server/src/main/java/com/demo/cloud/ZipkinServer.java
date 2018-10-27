package com.demo.cloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;


@SpringCloudApplication
public class ZipkinServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZipkinServer.class).web(WebApplicationType.SERVLET).run(args);
    }
}
