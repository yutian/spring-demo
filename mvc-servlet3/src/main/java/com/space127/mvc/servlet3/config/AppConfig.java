package com.space127.mvc.servlet3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @auther : Cenjinhao
 * @date : 2020/7/15 14:51
 * @desc :
 */
@Configuration
@ComponentScan(value = "com.space127.mvc.servlet3")
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer{


    public <T> void add(List<T> list, T t){
        list.add(t);
    }
}
