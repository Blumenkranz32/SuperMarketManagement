package com.seucxxy.dao;

import com.seucxxy.domain.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmployeeDao {

    @Insert("insert into employee_information values(#{name},#{sex},#{age},#{call},#{office},#{id})")
    public int save(Employee employee);     //添加新的雇员

    @Update("update employee_information set name = #{name}, sex = #{sex}, age = #{age}, `call` = #{call}, office = #{office} where id = #{id}")
    public int update(Employee employee);   //修改雇员信息

    @Delete("delete from employee_information where id=#{id}")
    public int delete(String id);   //删除雇员信息

    @Select("select * from employee_information where id = #{id}")
    public Employee getById(String id);     //查询名称

    @Select("select * from employee_information")
    public List<Employee> getAll();       //查询所有信息

}
