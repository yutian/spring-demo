package com.space127.bean.postprocesser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/4 13:37
 * @desc :
 */
@Configuration
public class LifecycleConfig {


    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        System.out.println("==================car=====================");
        return new Car("audi");
    }

    @Bean(initMethod = "initMethod",destroyMethod = "destoryMethod")
    public CarWithInitalizingDestroyBean carWithInitalizingDestroyBean(){
        System.out.println("==================CarWithInitalizingDestroyBean=====================");
        return new CarWithInitalizingDestroyBean("audi");
    }

    @Bean(initMethod = "initMethod",destroyMethod = "destoryMethod")
    public CarWithPostConstructPreDestory carWithPostConstructPreDestory(){
        System.out.println("==================CarWithPostConstructPreDestory=====================");
        return new CarWithPostConstructPreDestory("audi");
    }

    @Bean
    public CustomBeanPostProcess customBeanPostProcess(){
        return new CustomBeanPostProcess();
    }
}
