package com.springrest.eployee.services;

import java.util.List;

import com.springrest.eployee.entities.Employee;

public interface employeeService {
	public List<Employee> getEmployee();
	public Employee getEmployeebyid(long id);
	
	public Employee addEmployee(Employee emp);
	
	public List<Employee> deleteEmployeebyid(long id);
	
	
	public Employee Update(long id , Employee emp);
	

}
