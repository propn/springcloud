package com.propn.sc.resilience4j;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AopRetryController {

    @Resource
    HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return helloRemote.hello(name);
    }
}