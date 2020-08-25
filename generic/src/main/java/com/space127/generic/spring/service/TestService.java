package com.space127.generic.spring.service;

import com.space127.generic.spring.dao.StudentDao;
import com.space127.generic.spring.dao.TeacherDao;
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
public class TestService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private TeacherDao teacherDao;

    public void test(){
        Student s = new Student();
        s.setName("student");
        studentDao.save(s);

        Teacher t = new Teacher();
        t.setId(1L);
        t.setName("teacher");
        teacherDao.save(t);
    }
}
