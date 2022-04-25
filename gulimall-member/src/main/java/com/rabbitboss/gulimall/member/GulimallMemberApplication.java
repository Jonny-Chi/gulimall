package com.rabbitboss.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 1。想要远程调用别的服务
*   一。引入open-feign
*   二。编写一个接口，告诉SpringCloud，告诉这个接口需要调用远程服务
*       1.声明接口的每一个方法都是调用哪个远程服务的哪个请求
*   三。开启远程调用功能:@EnableFeignClients
* */
@EnableFeignClients(basePackages = "com.rabbitboss.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.rabbitboss.gulimall.member.dao")
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
