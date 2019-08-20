package com.aaa.ssm.serviceImpl;

import com.aaa.ssm.dao.IStuDao;
import com.aaa.ssm.entity.Student;
import com.aaa.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StuServiceImpl implements StudentService {
   @Autowired
    IStuDao stuDao;

    @Override
    public List<Student> list() {
        return stuDao.listM();
    }

    @Override
    public int add(Student student) {
        return stuDao.addM(student);
    }

    @Override
    public void delete(int stuId) {
            stuDao.deleteM(stuId);
    }

    @Override
    public int edit(Student student) {
        return stuDao.editM(student);
    }
}
