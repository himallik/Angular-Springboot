package com.mallik.EmpSkillsetPortal;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface EmployeeRepository extends Repository<Employee, Integer> {

    void delete(Employee employee);

    List<Employee> findAll();

    Employee findOne(int id);

    Employee save(Employee employee);
}
