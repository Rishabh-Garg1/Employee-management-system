package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entity.Employee;
import com.cognizant.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}
	
	@GetMapping("/allEmp")
	public List<Employee> getAllEmployee(){
		return this.employeeService.getSAllEmployees();
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmpById(@PathVariable Integer id) {
		return this.employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
		return this.employeeService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		return this.employeeService.deleteEmployee(id);
	}
	
	

	

}
