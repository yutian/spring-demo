package com.space127.bean.postprocesser;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/4 13:39
 * @desc :
 */
public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
        System.out.println("Car...Constructor ");
    }

    public void init(){
        System.out.println("car name:"+name);
        System.out.println("car ... init ...");
    }

    public void destory(){
        System.out.println("car ... destory ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
