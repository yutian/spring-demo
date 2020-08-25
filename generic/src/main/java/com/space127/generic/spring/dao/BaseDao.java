package com.space127.generic.spring.dao;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/13 10:21
 * @desc :
 */
public interface BaseDao<PK,T> {

    void save(T t);

    T get(PK pk);
}
