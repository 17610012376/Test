package com.aaa.ssm.entity;

public class Student {
    private Long stuId;
    private Long clsId;
    private String name;
    private String sex;
    private Long age;
    private Class cls;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public Long getClsId() {
        return clsId;
    }

    public void setClsId(Long clsId) {
        this.clsId = clsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Class getCls() {
        return cls;
    }

    public void setCls(Class cls) {
        this.cls = cls;
    }
}
