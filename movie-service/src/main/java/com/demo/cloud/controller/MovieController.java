package com.demo.cloud.controller;

import com.demo.cloud.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Random;

@Slf4j
@RestController
public class MovieController {

    @Value("${application.version}")
    private String version;

    @Value("${application.price}")
    private float price;

    @GetMapping("/movie")
    public Movie movie() {
        log.info("===movie-service===");
        return Movie.builder().id(price).name(version).build();
    }
}
