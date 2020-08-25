package com.space127.bean.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/24 21:03
 * @desc :
 */
@Service
public class B {

    @Autowired
    private A a;


    public void  test(){
        System.out.println(a);
    }
}
