package com.propn.sc.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        //http://192.168.206.1:8080/hello?name=lei
        HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
        return "hello "+name+"，this messge is from host"+request.getServerName() +":"+request.getServerPort();
    }

}
