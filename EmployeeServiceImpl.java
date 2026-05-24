package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Entity.Employee;
import com.nt.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void saveEmployee(Employee e) 
	{
		repo.save(e);
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) 
	{
		repo.deleteById(id);
	}

	@Override
	public Employee getEmployeeById(Integer id) 
	{
		return repo.findById(id).orElse(null);
	}

}
