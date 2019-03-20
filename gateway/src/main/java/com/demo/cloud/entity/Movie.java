package com.demo.cloud.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Description TODO
 * @Date 2019/3/19 11:24
 * @Author zhang.chao
 */
@Data
@Builder
public class Movie {

    private Long id;

    private String name;
}
