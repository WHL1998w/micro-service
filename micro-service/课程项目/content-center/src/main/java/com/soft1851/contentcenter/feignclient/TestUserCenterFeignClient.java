package com.soft1851.contentcenter.feignclient;

import com.soft1851.contentcenter.domain.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/
@FeignClient(name = "user-center")
public interface TestUserCenterFeignClient {
    /**
     * 多参数查询
     * @param userDto
     * @return
     */
    @GetMapping("/user/q")
    UserDto query(@SpringQueryMap UserDto userDto);
}
