package com.example.microservicesimpleprovider2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.example.microservicesimplecommon.utils","com.example.microservicesimpleprovider2"})
@MapperScan(basePackages="com.example.microservicesimpleprovider2.mapper")
//表示将微服务注册到eureka上,Spring cloud Edgware以及更高版本中，可以不加
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.example.microservicesimpleapi.service")
public class MicroserviceSimpleProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleProvider2Application.class, args);
    }

}
