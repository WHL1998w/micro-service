package com.soft1851.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerHelloApplication
 * @Description 启动主类
 * @Author wanghuanle
 * @Date 2020/9/13
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerHelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHelloApplication.class,args);

    }

    /**
     * 创建RestTemplate 实列并通过@Bean注解注入到IoC容器中
     * @return RestTemplate
     */
//    标注为一个实例
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
