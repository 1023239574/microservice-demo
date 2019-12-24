package com.example.microservicesimpledemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.example.microservicesimpleapi.service","com.example.microservicesimpledemo2","com.example.microservicesimplecommon.utils"})
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.example.microservicesimpleapi.service")
@EnableHystrix
@EnableCircuitBreaker
public class MicroserviceSimpleDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleDemo2Application.class, args);
    }

}
