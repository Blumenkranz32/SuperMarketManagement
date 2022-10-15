package com.seucxxy.domain;

public class Relationship {

    private String id;
    private String name;
    private String leader;
    private String department;
    private double salary;

    @Override
    public String toString() {
        return "Relationship{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", leader='" + leader + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Relationship() {
    }

    public Relationship(String id, String name, String leader, String department, double salary) {
        this.id = id;
        this.name = name;
        this.leader = leader;
        this.department = department;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
