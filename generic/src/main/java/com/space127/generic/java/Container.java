package com.space127.generic.java;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/11 17:30
 * @desc :
 */
public class Container<T> {

    private T t;

    private Set<String> set = new HashSet<>();

    public T getT() {
        return t;
    }

    public <T> Container<T> isBoolean(List<Boolean> data) {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        map.put("你好", "世界");
        System.out.println(map.get("hello"));
        return new Container<>();
    }

    public void testGenericType(List<T> data) {
        //如何获取data传入的是泛型类型
        Class<?> aClass = data.getClass();
        System.out.println(aClass);
        //Class实现了Type接口
        Type aType = aClass;
        //判断aType是否有泛型(返回false)
        System.out.println(aType instanceof ParameterizedType);
    }

    public void testGenericTypeAct(List<T> data) {
        //如何获取data传入的是泛型类型
        Class<?> aClass = data.getClass();
        System.out.println(aClass);
        //Class实现了Type接口
        Type aType = aClass.getGenericSuperclass();
        //判断aType是否有泛型(返回false)
        System.out.println(aType instanceof ParameterizedType);
        System.out.println(((ParameterizedType)aType).getActualTypeArguments()[0]);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        //可以通过元数据获取到泛型类型

        //Container.class类的class对象
        Class<?> testClass = Container.class;
        //获取类的属性字段
        Field[] declaredField = testClass.getDeclaredFields();
        //暴力解除，可以访问私有变量
        Field.setAccessible(declaredField, true);
        System.out.println("属性名：参数类型：参数泛型类型");
        for (Field field : declaredField) {
            String name = field.getName();
            Class<?> type = field.getType();
            Type genericType = field.getGenericType();
            System.out.println(name + ":" + type + ":" + genericType);
        }
        System.out.println("方法形参的泛型类型");
        Method method = testClass.getMethod("isBoolean", new Class[]{List.class});
        ParameterizedType parameterType = (ParameterizedType) method.getGenericParameterTypes()[0];
        System.out.println(parameterType.getActualTypeArguments()[0]); //获取第一个
        System.out.println("方法返回值的泛型类型");
        ParameterizedType returnType = (ParameterizedType) method.getGenericReturnType();
        System.out.println(returnType.getActualTypeArguments()[0]);

        //Java在编译的时候，会对方法实参以及方法内部进行泛型擦除（即用泛型实参上限代替真实的泛型类型）。
        // 但是泛型信息会保持在Signature中。故反射 不能获取到泛型对象。
        System.out.println("-----------------------------------------------------------------------------");
        Container<Dog> c = new Container<Dog>();
        List<Dog> l = new ArrayList<>();
        c.testGenericType(l);
        c.testGenericTypeAct(new ArrayList<Dog>(){});
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("getClass: "+ c.getClass());
        System.out.println("getGenericSuperclass: "+c.getClass().getGenericSuperclass());
        //获取形参
        System.out.println("getTypeParameters: " + Arrays.toString(c.getClass().getTypeParameters()));

        //获取实参
        Container<Dog> c2 = new Container<Dog>(){};
        System.out.println("getClass: "+ c2.getClass());
        Type type = c2.getClass().getGenericSuperclass();
        System.out.println("getGenericSuperclass: "+ type);
        ParameterizedType parameterizedType = (ParameterizedType)type;
        for(Type t : parameterizedType.getActualTypeArguments()){
            System.out.println("getActualTypeArguments : "+ t.getTypeName());
        }
    }
}
