package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
//@RunWith(SpringRunner.class)
class SenderTest //extends DemoApplicationTests
{

    @Resource
    Sender sender;

    @Test
    void send() {
        sender.send();
    }
}