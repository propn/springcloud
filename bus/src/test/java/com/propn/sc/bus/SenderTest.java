package com.propn.sc.bus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SenderTest {


    @Resource
    Sender sender;

    @Test
    void send() throws InterruptedException {
        for (int i = 0; i <100 ; i++) {
            sender.send();
            Thread.sleep(100);
        }

    }
}