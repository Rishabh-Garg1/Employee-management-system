package com.cognizant.service;

import java.util.List;

import com.cognizant.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	
	List<Employee> getSAllEmployees();
	
	Employee getEmployeeById(int id);
	
	Employee updateEmployee(int id, Employee employee);
	
	String deleteEmployee(int id);
	
	
	
	

}
