package com.wearock.scpractice.consumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class ConsumerMovieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMovieApplication.class, args);
    }
}
