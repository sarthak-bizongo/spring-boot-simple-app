package com.sargupta.sample.repository;

import com.sargupta.sample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}