package com.soft1851.contentcenter.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName
 * @Description TODO
 * @Author wanghuanle
 * @Date
 **/
@FeignClient(name = "baidu", url = "http://www.baidu.com")
public interface BaiduFeignClient {
    /**
     * 请求百度首页
     * @return
     */
    @GetMapping("")
    String index();
}
