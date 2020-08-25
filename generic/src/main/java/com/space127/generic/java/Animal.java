package com.space127.generic.java;

import java.util.List;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/11 15:59
 * @desc :
 */
public class Animal {

    private String name;


    public <T> void add(List<T> list,T t){
        list.add(t);
    }

    //编译失败
//    public  void add2(List<?> list){
//        list.add(new Object());
//    }

    // 这里有2个对象，依赖对象和被依赖对象，D extends T，D是依赖对象，T是被依赖对象。
    // 如果依赖对象不确定，可以使用泛型通配符，但是如果被依赖对象不确定，则不可以使用泛型通配符。
    public <D extends  T,T> void add3(List<T> animals,List<D> sons){
        animals.addAll(sons);
    }

    //？通配符确定的话，也是可以用add操作的，但是如果把super  Animal去掉就不行了
    public void add4(List<? super  Animal> animals,List<? extends Animal> sons){
        animals.addAll(sons);
    }

    // 这是比add3更好的方式
    // 依赖对象使用通配符没有问题，程序可以运行。因为通配符类型的上限就是T。
    public <T> void add5(List<T> animals,List<? extends T> sons){
        animals.addAll(sons);
    }


    // 如果被依赖对象不确定，则无法确定T类型的上限，导致程序编译出错。
    // 所以如果多个泛型类型之间有依赖关系，使用泛型方法会比较适合。
//    public <T> void add5error(List<?> animals,List<T extends ?> sons){
//        animals.addAll(sons);
//    }


 
}
