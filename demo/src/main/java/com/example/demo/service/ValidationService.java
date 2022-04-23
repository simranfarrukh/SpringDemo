		package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;


@Service
public class ValidationService {
	
	private List<Employee> employees;

	public ValidationService() {
		super();
		this.employees = new ArrayList<>();
		employees.add(new Employee("DUNDwight", "Pam@96", "Assistant to the Regional Manager", 9000));
	}
	
	
	public boolean isValidLogin(String username, String password) {
	return employees.contains(new Employee(username, password, "Assistant to the Regional Manager", 9000));
	}	
	
//	public boolean isValidLogin(Employee employee) {
//		return employees.contains(new Employee(employee.getUsername(), employee.getPassword()));
//		}
//	
//	public void addEmployee(Employee employee) {
//		er.save(employee)
//	}
//	
	
}
