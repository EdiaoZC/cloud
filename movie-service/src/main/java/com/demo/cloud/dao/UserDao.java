package com.demo.cloud.dao;

import com.demo.cloud.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description TODO
 * @Date 2019/3/18 15:11
 * @Author zhang.chao
 */
@Mapper
@Repository
public interface UserDao {

    List<Movie> find(@Param("e") Movie movie);

}
