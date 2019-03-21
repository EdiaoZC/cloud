package com.demo.cloud.controller;

import com.demo.cloud.dao.UserDao;
import com.demo.cloud.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @GetMapping("/movie/{id}")
    public Movie movie(@PathVariable("id") Long id) throws InterruptedException {
        List<Movie> query = userDao.find(Movie.builder().build());
        TimeUnit.MILLISECONDS.sleep(800);
        log.info("movie-service 处理请求,data:{}", query);
        return Movie.builder().id(id).name("Titan").version(version).build();
    }


    @GetMapping("/movie")
    public List<Movie> movie(@RequestParam("ids") List<Long> ids) {
        log.info("movie-service 处理请求,data:{}", ids);
        List<Movie> movies = new ArrayList<>();
        for (Long id : ids) {
            movies.add(Movie.builder().id(id).name("Titan").version(version).build());
        }
        return movies;
    }
}
