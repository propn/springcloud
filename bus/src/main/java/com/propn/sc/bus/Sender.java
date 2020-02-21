package com.propn.sc.bus;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class Sender {

    @Resource
    private AmqpTemplate amqpTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("Sender:" + context);
        System.out.println("--------------------------------------------------------");
        System.out.println();
        amqpTemplate.convertAndSend("hello", context);
    }

}
