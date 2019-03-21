package com.demo.cloud.hystrix;

import com.demo.cloud.entity.Movie;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixObservableCommand;
import rx.Observable;

/**
 * @Description TODO
 * @Date 2019/3/21 15:48
 * @Author zhang.chao
 */
public class MovieHystrix extends HystrixObservableCommand<Movie> {
    protected MovieHystrix(HystrixCommandGroupKey group) {
        super(group);
    }

    @Override
    protected Observable<Movie> construct() {
        return null;
    }
}
