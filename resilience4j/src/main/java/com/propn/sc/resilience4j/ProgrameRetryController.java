package com.propn.sc.resilience4j;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.vavr.control.Try;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Duration;

@RestController
public class ProgrameRetryController {

    @Resource
    HelloRemote helloRemote;

    @GetMapping("/hello2")
    public String hello2(String name) {
        RetryConfig config = RetryConfig.custom()
                .maxAttempts(2)
                .waitDuration(Duration.ofMillis(5000))
                .build();
        Retry retry = Retry.of("id", config);
        Try<String> result = Try.ofSupplier(Retry.decorateSupplier(retry, () -> helloRemote.hello(name)));
        return result.get();
    }
}