package com.bps.procrumentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProcrumentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcrumentServiceApplication.class, args);
    }

}
