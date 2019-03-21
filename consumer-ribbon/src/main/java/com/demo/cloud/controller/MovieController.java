package com.demo.cloud.controller;

import com.demo.cloud.entity.Movie;
import com.demo.cloud.service.MovieService;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping("/movie/{id}")
    public DeferredResult<Movie> movie(@PathVariable("id") Long id) throws ExecutionException, InterruptedException {
        DeferredResult<Movie> result = new DeferredResult<>(200L);
        result.setResult(service.movie(id).get());
        return result;
    }
}
