package com.mallik.EmpSkillsetPortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee delete(int id) {
        Employee employee = findById(id);
        if(employee != null){
            repository.delete(employee);
        }
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.save(employee);
    }
}
