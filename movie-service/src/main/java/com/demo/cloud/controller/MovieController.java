package com.demo.cloud.controller;

import com.demo.cloud.dao.UserDao;
import com.demo.cloud.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
@Slf4j
@RefreshScope
public class MovieController {

    @Autowired
    private UserDao userDao;
    @Value("${application.version}")
    private String version;

    @GetMapping("/movie")
    public Movie movie() throws InterruptedException {
        List<Movie> query = userDao.find(Movie.builder().build());
        TimeUnit.MINUTES.sleep(new Random().nextInt(300));
        log.info("movie-service 处理请求,data:{}", query);
        return Movie.builder().id(100L).name("Titan").version(version).build();
    }
}
