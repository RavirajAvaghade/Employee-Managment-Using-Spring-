package com.nt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.nt.Entity.Employee;
import com.nt.service.EmployeeService;

@Controller
public class EmployeeController
{
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String home()
    {
        return "index";
    }

    @PostMapping("/save")
    public String saveEmployee(Employee e)
    {
        service.saveEmployee(e);

        return "success";
    }
}