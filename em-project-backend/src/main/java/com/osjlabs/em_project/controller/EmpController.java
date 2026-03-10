package com.osjlabs.em_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osjlabs.em_project.entity.Employee;
import com.osjlabs.em_project.service.EmployeeService;


@RequestMapping("/employees")
@RestController
@CrossOrigin("http://localhost:3000")
public class EmpController {

    // List<Employee> employees= new ArrayList<>(); // object of List

    // We can not create direct object of EmployeeService Interface
    // We can impliment the interface
    // @Autowired
    // EmployeeService employeeService = new EmployeeServiceImpl();

    // Dependency Injectin // If we want to add dependency use constructor to add
    // dependency it is good practice
    @Autowired // But this is not good practice to add dependency direct
    EmployeeService employeeService; // Use of Inversion of Control by using IOC Container

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        System.out.println("Yes me a raha hu");
        return employeeService.readEmployee(id);
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        // employees.add(employee);
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("employees/{id}") // path variable
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id))
            return "Delete Sucessfully";
        return "Not found";
    }

    @PutMapping("employees/{id}")
    public String putMethodName(@PathVariable Long id, @RequestBody Employee employee) {
        // TODO: process PUT request

        return employeeService.updateEmployee(id, employee);
    }
}
