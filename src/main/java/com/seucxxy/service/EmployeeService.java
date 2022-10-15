package com.seucxxy.service;

import com.seucxxy.domain.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EmployeeService {

    /**
     * 保存
     * @param employee
     * @return
     */
    public boolean save(Employee employee);     //添加新的雇员


    /**
     * 修改
     * @param employee
     * @return
     */
    public boolean update(Employee employee);   //修改雇员信息


    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(String id);   //删除雇员信息

    /**
     * 按id查询
     * @param id
     * @return
     */
    public Employee getById(String id);     //查询名称

    /**
     * 查询所有信息
     * @return
     */
    public List<Employee> getAll();       //查询所有信息
}
