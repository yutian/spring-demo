package com.space127.innerclass;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/12 16:32
 * @desc :
 */
public class StaticInnerClassDemo {

    private String abc = "abc";

    public String getAbc(){
        return abc;
    }

    public static  void outTest(){
        System.out.println("outTest...");
    }


    static class InnerCls{

        private String name = "haha";

        public StaticInnerClassDemo  test(){
            StaticInnerClassDemo demo = new StaticInnerClassDemo();
            System.out.println(demo.abc);
            //因为是在类里面即使是private成员变量也可以访问而且被改变，看StaticInnerClassMain就不能改变了
            demo.abc = "bcd";
            System.out.println(this.name);
            System.out.println(demo.getAbc());
            StaticInnerClassDemo.outTest();
            return demo;
        }
    }

    public static void main(String[] args) {
        StaticInnerClassDemo.InnerCls innerCls = new StaticInnerClassDemo.InnerCls();
        StaticInnerClassDemo demo = innerCls.test();
        demo.abc = "ccc";
        System.out.println(demo.getAbc());
    }
}
