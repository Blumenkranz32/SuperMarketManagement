package com.seucxxy.controller;

import com.seucxxy.domain.Employee;
import com.seucxxy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Result save(@RequestBody Employee employee){
        boolean flag = employeeService.save(employee);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Employee employee){
        boolean flag = employeeService.update(employee);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable String id){
        boolean flag = employeeService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable String id){
        Employee employee = employeeService.getById(id);
        Integer code = employee !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = employee != null ? "" : "数据查询失败，请重新尝试！";
        return new Result(code,employee,msg);
    }

    @GetMapping
    public Result getAll(){
        List<Employee> employeeList = employeeService.getAll();
        Integer code = employeeList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = employeeList !=null ?"" : "数据查询失败，请重新尝试！";
        return new Result(code,employeeList,msg);
    }

}
