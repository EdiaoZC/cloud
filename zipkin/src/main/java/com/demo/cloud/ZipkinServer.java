package com.demo.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Description TODO
 * @Date 2019/3/11 18:43
 * @Author zhang.chao
 */
@SpringBootApplication
public class ZipkinServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZipkinServer.class).run(args);
    }
}
