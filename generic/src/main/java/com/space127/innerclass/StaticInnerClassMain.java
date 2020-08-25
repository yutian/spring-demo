package com.space127.innerclass;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/12 16:42
 * @desc :
 */
public class StaticInnerClassMain {

    public static void main(String[] args) {
        StaticInnerClassDemo.InnerCls innerCls = new StaticInnerClassDemo.InnerCls();
        StaticInnerClassDemo demo = innerCls.test();
//        demo.abc = "ccc";
        System.out.println(demo.getAbc());
    }
}
