package com.demo.cloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description TODO
 * @Date 2019/3/11 18:10
 * @Author zhang.chao
 */
@EnableHystrixDashboard
@SpringBootApplication
public class DashboardApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DashboardApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }
}
