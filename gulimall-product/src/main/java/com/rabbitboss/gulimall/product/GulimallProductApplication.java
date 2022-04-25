package com.rabbitboss.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.整合Mybatis-Plus
 * 1⃣️、导入依赖包
 * <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.5.1</version>
 * </dependency>
 *
 * 2⃣️、配置
 *  1。配置数据源
 *      1。导入数据库驱动
 *      2.在application.yml配置数据源
 *  2。配置Mybatis-Puls
 *      1.使用MapperScan
 *      2。告诉Mybatis-Plus，sql映射文件位置
 */
@MapperScan("com.rabbitboss.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
