package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo1.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
