package com.springrest.eployee.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.eployee.Dao.EmployeeDao;
import com.springrest.eployee.entities.Employee;
@Service
public class EmployeeServiceimpl implements employeeService  {
	@Autowired
	private EmployeeDao employeeDao;
	List<Employee> emp;
	
	public  EmployeeServiceimpl() {
//		emp = new ArrayList<>();
//		emp.add(new Employee(33000030,"Pappu Thakur","Frontend"));
//		emp.add(new Employee(33000031,"omen","Full stack"));
	}

	@Override
	public List<Employee> getEmployee() {
		
		
//		return emp;
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeebyid(long id) {
////		Employee e = null;
////		for(Employee emp:emp) {
////			if(emp.getEmpid()==id) {
////				e = emp;
////				break;
////			}
////		}
//      
		return employeeDao.getOne(id);
	}

	@Override
	public Employee addEmployee(Employee e) {
//		emp.add(e);
		employeeDao.save(e);
		return e;
	}

	@Override
	public List<Employee> deleteEmployeebyid(long id) {
//		Employee e = null;
//		for(Employee emp1:emp) {
//			if(emp1.getEmpid()==id) {
//				emp.remove(emp1);
//				
//				break;
//			}
//		
//		}
	Employee entity=employeeDao.findById(id).get();
		employeeDao.delete(entity);
         
		return emp;
	}

	@Override
	public Employee Update(long id, Employee emp) {

		Employee e = null;
//		for(Employee emp1:this.emp) {
//			if(emp1.getEmpid()==id) {
//				emp1.setEmpid(emp.getEmpid()); 
//				emp1.setEmpname(emp.getEmpname());
//				emp1.setDomain(emp.getDomain());
//				e = emp1;
//				return e;
//			}
//			
//				
//			
//			}
		employeeDao.save(emp);
		
      return emp;
		
	}
	




}
