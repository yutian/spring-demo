package com.space127.generic.spring.service;

import com.space127.generic.spring.dao.BaseDaoImpl;
import com.space127.generic.spring.dao.TeacherDao;
import com.space127.generic.spring.model.School;
import com.space127.generic.spring.model.Student;
import com.space127.generic.spring.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther : Cenjinhao
 * @date : 2020/8/13 10:28
 * @desc :
 */
@Service
public class TestService2 {

    @Autowired
    private BaseDaoImpl<String, School> schoolBaseDao;

    @Autowired
    private BaseDaoImpl<Long,Teacher> teacherBaseDao;

    @Autowired
    private TeacherDao teacherDao;

    public void test(){
        School s = new School();
        s.setName("School");
        s.setLocation("xxxx");
        System.out.println(schoolBaseDao);
        schoolBaseDao.save(s);

        Teacher t = new Teacher();
        t.setId(1L);
        t.setName("teacher");
        //teacherBaseDao 和  teacherDao 是一个东西
        System.out.println(teacherBaseDao);
        System.out.println(teacherDao);
        teacherBaseDao.save(t);

        if(schoolBaseDao.equals(teacherBaseDao)){
            System.out.println("schoolBaseDao equal teacherBaseDao");
        }

        System.out.println(teacherDao == teacherBaseDao);

    }
}
