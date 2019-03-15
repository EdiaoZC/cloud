package com.demo.cloud.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie {

    private Long id;

    private String name;

    private String version;
}
