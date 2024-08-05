package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.Employee;
import com.cognizant.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee e1 = this.employeeRepo.save(employee);
		return e1;
	}

	@Override
	public List<Employee> getSAllEmployees() {
		List<Employee> employees =  this.employeeRepo.findAll();
		for(Employee emp : employees) {
			emp.setPhoneNo("**********");
		}
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		Employee findById = this.employeeRepo.findById(id).get();
		findById.setPhoneNo("**********");
		return findById;
	}

	@Override
	public Employee updateEmployee(int id, Employee employee) {
		Employee oldEmployee = this.employeeRepo.findById(id).get();
		oldEmployee.setAddress(employee.getAddress());
		oldEmployee.setDOB(employee.getDOB());
		oldEmployee.setName(employee.getName());
		oldEmployee.setPhoneNo(employee.getPhoneNo());
		
		Employee save = this.employeeRepo.save(oldEmployee);
		return save;
	}

	@Override
	public String deleteEmployee(int id) {
		if(this.employeeRepo.existsById(id)) {
		this.employeeRepo.deleteById(id);
		return "User Deleted By Id: "+id;}
		return "Id not exists";
	}


}
