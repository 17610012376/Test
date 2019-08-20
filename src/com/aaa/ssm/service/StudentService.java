package com.aaa.ssm.service;

import com.aaa.ssm.entity.Student;

import java.util.List;

public interface StudentService {

      List<Student> list();//  查询
    int add(Student student);//  添加
    void delete(int stuId);//  删除
    int edit(Student student);//  修改
}
