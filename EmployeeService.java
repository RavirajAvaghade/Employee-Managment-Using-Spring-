package com.nt.service;

import java.util.List;

import com.nt.Entity.Employee;

public interface EmployeeService
{
   public void saveEmployee(Employee e);
   
   public List<Employee> getAllEmployee();
   
   public void delete(Integer id);
   
   public Employee getEmployeeById(Integer id);
   
   
}
