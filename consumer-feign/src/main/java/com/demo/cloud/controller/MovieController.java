package com.demo.cloud.controller;

import com.demo.cloud.client.MovieClient;
import com.demo.cloud.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieClient movieClient;

    @GetMapping("/movie")
    public Movie movie() {
        return movieClient.movie();
    }
}
