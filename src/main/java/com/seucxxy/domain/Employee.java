package com.seucxxy.domain;

public class Employee {
    private String name;
    private String sex;
    private int age;
    private String call;
    private String office;
    private String id;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", call='" + call + '\'' +
                ", office='" + office + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getCall() {
        return call;
    }

    public String getOffice() {
        return office;
    }
}
