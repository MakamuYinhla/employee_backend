package com.example.employee_tutorial.entity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_tutorial.entity.model.Employee;
import com.example.employee_tutorial.entity.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }


    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id){
        return employeeRepository.getReferenceById(id);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);;
    }

    public void deleteAllEmployees(){
        employeeRepository.deleteAll();
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            Employee present = employee.get();
            present.setEmail(updatedEmployee.getEmail());
            present.setFirstName(updatedEmployee.getFirstName());
            present.setLastName(updatedEmployee.getLastName());
            return employeeRepository.save(present);
        }
        return null;
    }
}
