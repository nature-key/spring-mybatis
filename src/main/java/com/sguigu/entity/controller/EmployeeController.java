package com.sguigu.entity.controller;

import java.util.List;
import java.util.Map;

import com.sguigu.entity.Employee;
import com.sguigu.entity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmployeeController {

    @Autowired
    protected EmployeeService employeeService;

    public List<Employee> emps() {
        List<Employee> emps = employeeService.getEmps();
        return emps;
    }

}
