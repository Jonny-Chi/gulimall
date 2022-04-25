package com.rabbitboss.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/*
* 1、如何使用Nacos作为配置中心统一管理配置
*
* 1）、引入依赖，
*       <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
        </dependency>
* 2）、创建一个bootstaro.preties文件
*               spring.application.name=gulimall-coupon

                spring.cloud.nacos.config.server-addr=127.0.0.1:8848
* 3）、给配置中心默认添加一个叫数据集（DataId）gulimall-coupon.properties。默认规则，应用名.properties
* 4)、给应用名.properties添加配置
* 5）、动态获取配置。
*       @RefreshScope：动态获取并刷新配置
*       @Value("${配置项的名}")
*       如果配置中心和当前应用的配置文件中都配置了相同的项，会优先使用配置中心的配置
*
* 2。细节
*   1).命名空间：配置隔离
*       默认public（保留空间）；默认新增所有的配置文件都在public空间
*           1。开发，测试，生产；利用命名空间来做环境隔离。
*           注意，在bootstrap.properties的配置上，需要使用哪个命名空间下的配置
*                   spring.cloud.nacos.config.namespace=4df4b2fb-a06d-4edc-bd7c-a0fbbc5c87fa
*           2。每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
*   2).配置集：
*       所有配置的集合
*   3).配置集 ID：
*       类似于配置文件名：即Data ID
*   4).配置分组：
*       默认所有的配置集都属于，"DEFAULT_GROUP"
*
* 每个微服务创建自己的命名空间，dev,test,prod
*
* 3.同时加载多个配置集
*   1）、微服务任何配置信息，任何配置文件，都可以放在配置中心中，
*   2）、只需要在bootstarp.properties中加载配置中心哪些配置文件即可
*   3）、@Value,@ConfigurationProperties  ......
*   以前SpringBoot任何方法从配置文件中获取值，都能使用，
*   配置中心有的，优先使用配置中心的配置
* */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.rabbitboss.gulimall.coupon.dao")
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
