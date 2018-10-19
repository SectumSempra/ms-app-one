package com.be.appone.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients("com.be.appone.common.feignapi")
@SpringBootApplication
public class AppOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppOneApplication.class, args);
    }
}
