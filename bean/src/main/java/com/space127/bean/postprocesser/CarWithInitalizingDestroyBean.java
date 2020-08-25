package com.space127.bean.postprocesser;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/4 13:41
 * @desc :
 */
public class CarWithInitalizingDestroyBean  implements InitializingBean, DisposableBean {

    private String name;

    public CarWithInitalizingDestroyBean(String name) {
        this.name = name;
        System.out.println("CarWithInitalizingDestroyBean...Constructor ");
    }

    public void initMethod(){
        System.out.println("CarWithInitalizingDestroyBean name:"+name);
        System.out.println("CarWithInitalizingDestroyBean ... initMothod ...");
    }

    public void destoryMethod(){
        System.out.println("CarWithInitalizingDestroyBean ... destoryMethod ...");
    }

    public void destroy() throws Exception {
        System.out.println("CarWithInitalizingDestroyBean ...DisposableBean... destory");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("CarWithInitalizingDestroyBean...InitializingBean...afterPropertiesSet");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
