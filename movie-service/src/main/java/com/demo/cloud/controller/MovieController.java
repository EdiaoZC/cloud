package com.demo.cloud.controller;

import com.demo.cloud.entity.Movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@Slf4j
@RefreshScope
public class MovieController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${application.version}")
    private String version;

    @GetMapping("/movie")
    public Movie movie() {
        List<Movie> query = jdbcTemplate.query("select * from user",
                (rs, rowNum) -> Movie.builder().id(rs.getLong(1)).name(rs.getString(3)).build());

        log.info("movie-service 处理请求,data:{}", query);
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Movie.builder().id(100L).name("Titan").version(version).build();
    }
}
