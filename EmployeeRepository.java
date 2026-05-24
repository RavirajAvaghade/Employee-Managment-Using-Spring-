package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.Entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer>
{
   
	
}
