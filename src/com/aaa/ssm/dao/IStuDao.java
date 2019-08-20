package com.aaa.ssm.dao;

import com.aaa.ssm.entity.Student;

import java.util.List;

public interface IStuDao {
    public List<Student> listM();

    public int addM(Student student);

    public void deleteM(int stuId);

    public int editM(Student student);
}
