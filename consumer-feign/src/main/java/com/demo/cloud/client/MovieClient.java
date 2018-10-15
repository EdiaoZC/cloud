package com.demo.cloud.client;

import com.demo.cloud.client.impl.MovieClientImpl;
import com.demo.cloud.entity.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "movie-micro-service", fallback = MovieClientImpl.class)
public interface MovieClient {

    @GetMapping("/movie")
    Movie movie();
}
