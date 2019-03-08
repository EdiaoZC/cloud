package com.demo.cloud.client.impl;

import com.demo.cloud.client.MovieClient;
import com.demo.cloud.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MovieClientImpl implements MovieClient {


    @Override
    public Movie movie() {
        log.info("降级");
        return null;
    }
}
