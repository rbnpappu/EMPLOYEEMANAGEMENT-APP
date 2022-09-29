package com.springrest.eployee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.eployee.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Long>{

}
