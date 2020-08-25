package com.space127.generic.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/13 10:25
 * @desc :
 */
@Repository
public class BaseDaoImpl<PK,T> implements BaseDao<PK,T> {

    @Override
    public void save(T t) {
        System.out.println(t.toString());
    }

    @Override
    public T get(PK pk) {
        System.out.println(pk.toString());
        return null;
    }
}
