package com.osjlabs.em_project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osjlabs.em_project.entity.Employee;
import com.osjlabs.em_project.entity.EmployeeEntity;
import com.osjlabs.em_project.repository.EmployeeRepository;
import com.osjlabs.em_project.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    // List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        
        employeeRepository.save(employeeEntity);
        //employees.add(employee);
        return "Saved Succesfully";
    }



    @Override
    public Employee readEmployee(Long id) {
         EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
          Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity,employee);
        
        return employee;
        }



    @Override
    public List<Employee> readEmployees() {
        List<EmployeeEntity> employeesList = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        
        for(EmployeeEntity employeeEntity : employeesList){
            
            Employee emp = new Employee();
            emp.setId(employeeEntity.getId());
            emp.setName(employeeEntity.getName());
            emp.setEmail(employeeEntity.getEmail());
            emp.setPhone(employeeEntity.getPhone());
            
            employees.add(emp);
        }
        return employees;
    }

    // @Override
    // public boolean deleteEmployee(Long id) {
    //     //employees.remove(id);
    //     EmployeeEntity emp = employeeRepository.findBy(id);
    //     employeeRepository.delete(emp);
    //     return true;
    // }

    @Override
    public boolean deleteEmployee(long id) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteEmployee'");
        
        EmployeeEntity emp = employeeRepository.findById(id).get();
        employeeRepository.delete(emp);
        return true;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity excestingEmployee = employeeRepository.findById(id).get();
        
        excestingEmployee.setEmail(employee.getEmail());
        excestingEmployee.setName(employee.getName());
        excestingEmployee.setPhone(employee.getPhone());
        
        employeeRepository.save(excestingEmployee);
        
        return "Update Successfully";
    }


    

}
