package com.springrest.eployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.eployee.entities.Employee;
import com.springrest.eployee.services.*;
@RestController
@CrossOrigin("http://localhost:3000/")
public class mycontroller {
	
	@Autowired
private employeeService  employeeService ;
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to employeement page";
		
	}
	//get details
	@GetMapping("/employes")
	public List<Employee> getEmployee(){
		
		return this.employeeService.getEmployee();
		
	}
	
	@GetMapping("/employes/{id}")
	public Employee getEmployeebyid(@PathVariable String id) {
		return this.employeeService.getEmployeebyid(Long.parseLong(id));
		
	}
	
	@PostMapping(path="/employes",consumes="application/json") 
	public Employee addEployee(@RequestBody Employee emp){
		
		return this.employeeService.addEmployee(emp);
		
	}
	@DeleteMapping("/employes/{id}")
	public List<Employee> deleteEmployee(@PathVariable String id) {
		return this.employeeService.deleteEmployeebyid(Long.parseLong(id));
	}
	@PutMapping("/employes/{id}")
	public Employee Update(@PathVariable long id , @RequestBody Employee emp) {
		return this.employeeService.Update(id, emp);
		
	}
}
