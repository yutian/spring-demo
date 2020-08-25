package com.space127.bean.postprocesser;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/4 13:41
 * @desc :
 */
public class CarWithPostConstructPreDestory implements InitializingBean, DisposableBean {

    private String name;

    public CarWithPostConstructPreDestory(String name) {
        this.name = name;
        System.out.println("CarWithPostConstructPreDestory...Constructor ");
    }

    public void initMethod(){
        System.out.println("CarWithPostConstructPreDestory name:"+name);
        System.out.println("CarWithPostConstructPreDestory ... initMothod ...");
    }

    public void destoryMethod(){
        System.out.println("CarWithPostConstructPreDestory ... destoryMethod ...");
    }

    public void destroy() throws Exception {
        System.out.println("CarWithPostConstructPreDestory ...DisposableBean... destory");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("CarWithPostConstructPreDestory...InitializingBean...afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("CarWithPostConstructPreDestory...postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("CarWithPostConstructPreDestory... preDestroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
