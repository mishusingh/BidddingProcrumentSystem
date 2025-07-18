package com.bps.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient
public class ConfigServerApplication {
    //this is config

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
