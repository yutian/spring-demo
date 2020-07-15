package com.space127.mvc.servlet3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther : Cenjinhao
 * @date : 2020/7/15 14:49
 * @desc :
 */
@Controller
public class DemoController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello mvc-servlet3");
        return "haha";
    }
}
