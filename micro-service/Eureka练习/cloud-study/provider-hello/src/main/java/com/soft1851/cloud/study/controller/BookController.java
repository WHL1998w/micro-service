package com.soft1851.cloud.study.controller;

import com.soft1851.cloud.study.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName BookController
 * @Description TODO
 * @Author wanghuanle
 * @Date 2020/9/13
 **/
@RestController
@RequestMapping(value = "/book")
public class BookController {
    @GetMapping(value = "/{id}")
    public List<Book> getBook(@PathVariable int id){
        Book[] books = new Book[]{
                new Book(1,"朝花夕拾",30.50,"鲁迅"),
                new Book(2,"人生",30.50,"路遥"),
                new Book(3,"你是人间四月天",30.50,"林徽因"),
                new Book(4,"我们三",30.50,"杨绛"),
        };
        return Arrays.asList(books);
    }
}