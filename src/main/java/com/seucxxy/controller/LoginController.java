package com.seucxxy.controller;

import com.seucxxy.domain.Employee;
import com.seucxxy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Result save(@RequestBody Employee employee){
        boolean flag = employeeService.save(employee);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable String id){
        Employee employee = employeeService.getById(id);
        Integer code = employee !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = employee != null ? "" : "账号或密码错误";
        return new Result(code,employee,msg);
    }

}
