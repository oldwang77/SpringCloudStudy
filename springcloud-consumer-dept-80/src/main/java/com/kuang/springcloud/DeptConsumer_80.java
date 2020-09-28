package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// Ribbon和eureka整合以后，客户端可以直接调用，不用关系ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_80 {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
