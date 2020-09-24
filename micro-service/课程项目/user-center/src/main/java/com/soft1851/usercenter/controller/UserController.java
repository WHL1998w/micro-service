package com.soft1851.usercenter.controller;

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
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping(value = "/hello")
    public String getHello(){
        return "hello user-center";
    }
}
