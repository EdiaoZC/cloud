package com.demo.cloud.cotnroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Description TODO
 * @Date 2019/3/19 14:00
 * @Author zhang.chao
 */
@RestController
public class HystrixController {

    @GetMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("timeout");
    }


}
