package com.demo.cloud.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie {

    private Float id;

    private String name;
}
