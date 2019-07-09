package com.sargupta.sample.service;

import com.sargupta.sample.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(long id);
    List<Employee> getAllEmployees();
}