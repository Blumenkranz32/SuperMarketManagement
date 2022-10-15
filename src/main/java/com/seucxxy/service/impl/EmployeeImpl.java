package com.seucxxy.service.impl;

import com.seucxxy.controller.Code;
import com.seucxxy.dao.EmployeeDao;
import com.seucxxy.domain.Employee;
import com.seucxxy.exception.BusinessException;
import com.seucxxy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public boolean save(Employee employee) {
        return employeeDao.save(employee)>0;
    }

    @Override
    public boolean update(Employee employee) {
        return employeeDao.update(employee)>0;
    }

    @Override
    public boolean delete(String id) {
        return employeeDao.delete(id)>0;
    }

    @Override
    public Employee getById(String id) {
        if(Integer.parseInt(id)<0){
            throw new BusinessException(Code.BUSSINESS_ERR,"请输入正确的id！");
        }
        return employeeDao.getById(id);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
