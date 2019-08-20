package com.aaa.ssm.controller;

import com.aaa.ssm.entity.Student;
import com.aaa.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("")
public class StudentController {
    @Autowired
    StudentService studentService;

//    返回
    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView mav = new ModelAndView();
        List<Student> stu = studentService.list();
        mav.addObject("stu",stu);
        mav.setViewName("list");
        return mav;
    }
    @RequestMapping("edit")
    public ModelAndView edit(Student student){
        studentService.edit(student);
        ModelAndView mav  = new ModelAndView("redirect:/list");
        return mav;
    }
    @RequestMapping("delete")
    public ModelAndView delete(int stuId){
        studentService.delete(stuId);
        ModelAndView mav = new ModelAndView("redirect:/list");
        return mav;
    }
    @RequestMapping("addgo")
    public ModelAndView addgo(){
        ModelAndView mav  =new ModelAndView("add");
        return mav;
    }
    @RequestMapping("add")
    public ModelAndView add(Student student){
        studentService.add(student);
        ModelAndView mav = new ModelAndView("redirect:/list");
        return mav;
		//dwdawdadw
    }
}
