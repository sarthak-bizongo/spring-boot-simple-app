package com.sargupta.sample.service;

import com.sargupta.sample.model.Employee;
import com.sargupta.sample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Qualifier("employeeRepository")
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(long id) {

        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
