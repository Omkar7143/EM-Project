package com.osjlabs.em_project.service;

import java.util.List;

import com.osjlabs.em_project.entity.Employee;

public interface EmployeeService {
    
   String createEmployee(Employee employee);  // abstract method does nob  bh t have body
   List<Employee> readEmployees();
   boolean deleteEmployee(long  id);
   String updateEmployee(Long id, Employee employee);
   Employee readEmployee(Long id);
  
}
