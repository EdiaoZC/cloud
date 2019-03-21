package com.demo.cloud.service.impl;

import com.demo.cloud.entity.Movie;
import com.demo.cloud.service.MovieService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

@Service
@Slf4j
public class MovieServiceImpl implements MovieService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCollapser(scope = com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL, batchMethod = "movies",
            collapserProperties = {@HystrixProperty(name = "timerDelayInMilliseconds", value = "100"),
                    @HystrixProperty(name = "maxRequestsInBatch", value = "10")})
    public Future<Movie> movie(Long id) {
        return null;
    }

    @HystrixCommand(fallbackMethod = "movieHystrix")
    public List<Movie> movies(List<Long> ids) {
        log.info("batch request movie-service");
        return restTemplate.getForObject("http://movie-service/movie?ids={1}", List.class, Strings.join(ids, ','));
    }

    private List<Movie> movieHystrix(List<Long> id) {
        log.info("movieHystrix");
        return Collections.emptyList();
    }
}
