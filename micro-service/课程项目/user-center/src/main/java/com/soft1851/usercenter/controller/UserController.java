package com.soft1851.usercenter.controller;

import com.soft1851.usercenter.domain.entity.User;
import com.soft1851.usercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/
@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/{id}")
    public User findUserById(@PathVariable Integer id) {
        log.info("我被请求了...");
        return this.userService.findById(id);
    }

//    可能构成的请求url:q?id=1&wxId=aaa&...
    @GetMapping("/q")
    public User query(User user){
        return user;
    }

}