package com.demo.cloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Descirption TODO
 * @Author chao.zhang
 * @Date 2018/10/16 14:51
 */
@EnableConfigServer
@SpringCloudApplication
public class ConfigServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServer.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
