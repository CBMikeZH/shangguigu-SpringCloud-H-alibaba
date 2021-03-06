package com.mz.springcloud.provider.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZookeeperMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZookeeperMain.class, args);
    }
}
