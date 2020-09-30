package com.soft1851.contentcenter.feignclient;

import com.soft1851.contentcenter.configuration.GlobalFeignConfiguration;
import com.soft1851.contentcenter.configuration.UserCenterFeignConfiguration;
import com.soft1851.contentcenter.domain.dto.UserDto;
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
    /**
     * http://user-center/users/{i//@FeignClient(name = "user-center",configuration = UserCenterFeignConfiguration.class)d}
     *
     * @param id
     * @return UserDTO
     */
    @GetMapping("/users/{id}")
    UserDto findUserById(@PathVariable Integer id);

    /**
     * hello测试
     * @return String
     */
    @GetMapping("/user/hello")
    String getHello();
}