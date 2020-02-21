package com.example.demo;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@RabbitListener(queues = "hello")
public class Receiver {
    @RabbitHandler
    public void process(String hello) throws InterruptedException {
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("Receiver:" + hello);
        Thread.sleep(1000);
        System.out.println("--------------------------------------------------------");
        System.out.println();
    }
}
