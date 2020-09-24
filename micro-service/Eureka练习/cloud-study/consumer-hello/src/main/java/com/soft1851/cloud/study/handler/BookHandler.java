package com.soft1851.cloud.study.handler;

import com.soft1851.cloud.study.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BookHandler
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/9/13
 **/
@RestController
@RequestMapping("consumer")
public class BookHandler {
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/{id}")
    public List<Book> getBook(@PathVariable int id){
        return (List<Book>) restTemplate.getForObject("http://wanghuanle.com:8001/book/{id}",Book.class,id);
    }
}