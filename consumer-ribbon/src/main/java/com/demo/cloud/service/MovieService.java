package com.demo.cloud.service;

import com.demo.cloud.entity.Movie;

import java.util.concurrent.Future;

public interface MovieService {

    Future<Movie> movie(Long id);
}
