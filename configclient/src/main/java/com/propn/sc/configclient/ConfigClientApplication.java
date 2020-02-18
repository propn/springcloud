package com.propn.sc.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${env}")
    private String env;

    @Value("${hello}")
    private String hello;

    @Value("${spring.application.name:application}")
    private String name;

    public void run(String... args) {
        System.out.println("================");
        System.out.println(name);
        System.out.println(hello);
        System.out.println("================");
    }
}
