package com.propn.sc.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    HelloRemote HelloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        System.out.println(name);
        return HelloRemote.hello(name);
    }

}
