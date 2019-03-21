package com.demo.cloud.controller;

import com.demo.cloud.client.MovieClient;
import com.demo.cloud.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class MovieController {

    @Autowired
    private MovieClient movieClient;

    @GetMapping("/movie/{id}")
    public Movie movie(@PathVariable("id") Long id) {
        log.info("feign处理请求");
        return movieClient.movie(id);
    }
}
