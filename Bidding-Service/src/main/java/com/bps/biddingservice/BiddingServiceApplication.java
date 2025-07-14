package com.bps.biddingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableKafka
public class BiddingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiddingServiceApplication.class, args);
    }

}
