package com.demo.cloud.service.impl;

import com.demo.cloud.entity.Movie;
import com.demo.cloud.service.MovieService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class MovieServiceImpl implements MovieService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "movieHystrix")
    public Movie movie() {
        log.info("============");
        return restTemplate.getForObject("http://movie-micro-service/movie", Movie.class);
    }

    private Movie movieHystrix() {
        log.info("============");
        return null;
    }
}
