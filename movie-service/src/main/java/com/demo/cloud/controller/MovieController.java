package com.demo.cloud.controller;

import com.demo.cloud.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@Slf4j
public class MovieController {

    @GetMapping("/movie")
    public Movie movie() {
        log.info("movie-service 处理请求");
        try {
            Thread.sleep(new Random().nextInt(300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Movie.builder().id(100L).name("Titan").build();
    }
}
