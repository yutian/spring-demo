package com.space127.innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/12 16:36
 * @desc :
 */
public class InnerClassDemo {

    private String str = "aaa";

    private List<String> list = new ArrayList<>();

    void outerTest(char ch,List<Integer> list2){
        Integer integer = 1;
        Inner inner = new Inner(){

            void test(){
                System.out.println("test");
            }

            {
                System.out.println(str);
                System.out.println(ch);
                System.out.println(integer);
                //虽然这里没有加final，但是如果改变integer的值是会编译报错的，ch也是的，但外部的成员变量不受影响
//                integer = 2;
//                ch = 'n';
                str = "ccc";
                System.out.println(str);
                list.add("lll");
                // 这里不会编译异常，因为是对象引用，非基本类型
                list2.add(4);
                test();
            }
        };
    }

    public String getStr() {
        return str;
    }

    public List<String> getList() {
        return list;
    }

    class Inner{}

    public static void main(String[] args) {
        InnerClassDemo demo= new InnerClassDemo();
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        System.out.println(intList);
        demo.outerTest('a',intList);
        System.out.println(intList);
        System.out.println(demo.getStr());
        System.out.println(demo.getList());
    }
}
