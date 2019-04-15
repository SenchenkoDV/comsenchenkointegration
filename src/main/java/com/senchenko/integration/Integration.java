package com.senchenko.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

import java.io.IOException;

@SpringBootApplication
@EnableIntegration
@IntegrationComponentScan
public class Integration {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Integration.class, args);
    }
}
