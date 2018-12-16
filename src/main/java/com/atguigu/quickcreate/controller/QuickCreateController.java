package com.atguigu.quickcreate.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法返回的数据直接写给浏览器(如果是对象转为JSON数据)
//@ResponseBody
//@Controller
@RestController
public class QuickCreateController {

    @Value("${person.lastName}")
    private String name;


    @RequestMapping("/hello")
    public String hello(){
        return "hello"+name;
    }

    public void git(){
        System.out.println("second commit");
    }
}
