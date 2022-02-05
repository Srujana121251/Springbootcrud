package com.example.demo1.service;



import java.util.List;

import com.example.demo1.bean.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployee(Employee employee, int id);
	void deleteEmployee(int id);

}

