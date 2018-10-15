package com.demo.cloud.controller;

import com.demo.cloud.entity.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MovieController {

    @GetMapping("/movie")
    public Movie movie() {
        try {
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Movie.builder().id(100L).name("Titan").build();
    }
}
