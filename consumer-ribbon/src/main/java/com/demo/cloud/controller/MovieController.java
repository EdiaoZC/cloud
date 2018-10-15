package com.demo.cloud.controller;

import com.demo.cloud.entity.Movie;
import com.demo.cloud.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("/movie")
    public Movie movie() {
        return service.movie();
    }
}
