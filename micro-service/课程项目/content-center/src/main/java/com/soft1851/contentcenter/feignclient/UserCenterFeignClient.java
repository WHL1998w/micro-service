package com.soft1851.contentcenter.feignclient;


import com.soft1851.contentcenter.domain.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/
//@FeignClient(name = "user-center",configuration = UserCenterFeignConfiguration.class)
@FeignClient(name = "user-center")
public interface UserCenterFeignClient {
    @GetMapping("/user/one/{userId}")
    User findById(@PathVariable Integer userId);
}