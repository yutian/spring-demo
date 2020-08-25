package com.space127.bean.postprocesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/4 21:43
 * @desc :
 */
public class CustomBeanPostProcess implements BeanPostProcessor {


    /**
     * 在每个bean创建之后的初始化方法之前调用
     * @param bean 当前实例化的bean
     * @param beanName bean的名称
     * @return 返回实例化的bean或者可以对对象进行再封装返回
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor的postProcessBeforeInitialization方法执行，当前bean【" + bean + "】");
        return bean;
    }


    /**
     * 在每个bean的初始化方法执行之后被调用
     * @param bean 当前实例化的bean
     * @param beanName bean的名称
     * @return 返回实例化的bean或者可以对对象进行再封装返回
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor的postProcessAfterInitialization方法执行，当前bean【" + bean + "】");
        return bean;
    }
}
