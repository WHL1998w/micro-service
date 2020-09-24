package com.soft1851.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName UserDtoMain
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/9/16
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class UserDtoMain {
    public static void main(String[] args) {
        SpringApplication.run(UserDtoMain.class, args);
    }
}