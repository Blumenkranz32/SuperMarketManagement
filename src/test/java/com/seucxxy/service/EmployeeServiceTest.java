package com.seucxxy.service;

import com.seucxxy.config.SpringConfig;
import com.seucxxy.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class EmployeeServiceTest {

    @Autowired
    private GoodsService goodsService;

//    @Test
//    public void testgetById(){
//        Employee employee = employeeService.getById("1");
//        System.out.println(employee);
//    }

    //    @Test
//    public void testsave(){
//        Employee employee = new Employee();
//        employee.setAge(30);
//        employee.setCall("12341242");
//        employee.setId("2");
//        employee.setName("wxc");
//        employee.setOffice("1231");
//        employee.setSex("男");
//        employeeService.save(employee);
//        System.out.println(employee);
//    }
//    @Test
//    public void update() {
//        Employee employee = new Employee();
//        employee.setAge(30);
//        employee.setCall("12341242");
//        employee.setId("2");
//        employee.setName("wxc");
//        employee.setOffice("1231");
//        employee.setSex("男");
//        employeeService.update(employee);
//        System.out.println(employee);
//    }
    @Test
    public void search() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        String sdate = sdf.format(date);
        double f = 1231;
        System.out.println(sdate);
        System.out.println(goodsService.getIncome(sdate));
//      goodsService.getSell(123);
    }
}
