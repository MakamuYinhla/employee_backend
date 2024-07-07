package com.example.employee_tutorial.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee_tutorial.entity.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    
} 