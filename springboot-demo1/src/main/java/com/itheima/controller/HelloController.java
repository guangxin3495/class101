package com.itheima.controller;

import com.itheima.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private User user;

    @GetMapping("/user/hello")
    public String sayHello(){
        return "这是我第一个springboot项目，hello方法";
    }
    @GetMapping("/hello/hello")
    public String sayHello2(){
        return "这是我第一个springboot项目,hello2方法";
    }
}
