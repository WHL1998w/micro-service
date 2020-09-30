package com.soft1851.usercenter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/
@RestController
@Slf4j
@RequestMapping(value = "/user")
public class UserHello {
    @GetMapping(value = "/hello")
    public String getHello(){
        log.info("我被调用了。。。");
        return "hello user-center";
    }
}
