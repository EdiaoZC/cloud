package com.demo.cloud.client;

import com.demo.cloud.client.impl.MovieClientImpl;
import com.demo.cloud.entity.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "movie-service",  fallback = MovieClientImpl.class)
public interface MovieClient {

    @GetMapping("/movie/{id}")
    Movie movie(@PathVariable("id")Long id);
}
