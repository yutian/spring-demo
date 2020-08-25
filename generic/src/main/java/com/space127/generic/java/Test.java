package com.space127.generic.java;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/11 18:26
 * @desc :
 */
public class Test {

    private int age;

    public class Demo implements Runnable{

        @Override
        public void run() {
            System.out.println(Demo.class.getGenericSuperclass());
            System.out.println(age);
        }
    }

    public void run(){
        Demo d = new Demo();
        d.run();
    }

    public <T> boolean isBoolean(List<T> data){
        Class<?> aClass =data.getClass();
        System.out.println(aClass);
        Type aType = aClass.getGenericSuperclass();
        System.out.println(aType);
        System.out.println(((ParameterizedType)aType).getActualTypeArguments()[0]);
        return true;
    }

    public static void main(String[] args) {
        Test t = new Test();
        ArrayList<String> aa = new ArrayList<String>();
        aa.add("ss");
        t.isBoolean(aa);
        int age = 10;
        t.isBoolean(new ArrayList<String>(){{
            System.out.println(age);add("s");add("xx");} });

//        t.run();
    }
}
