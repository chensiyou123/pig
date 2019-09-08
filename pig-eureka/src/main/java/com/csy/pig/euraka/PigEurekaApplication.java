package com.csy.pig.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PigEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(PigEurekaApplication.class, args);
    }
}
