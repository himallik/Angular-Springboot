package com.mallik.EmpSkillsetPortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping({"/api"})
@RequestMapping({"/employees"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }

    @GetMapping(path = {"/{id}"})
    public Employee findOne(@PathVariable("id") int id){
        return employeeService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Employee update(@PathVariable("id") int id, @RequestBody Employee employee){
        employee.setId(id);
        return employeeService.update(employee);
    }

    @DeleteMapping(path ={"/{id}"})
    public Employee delete(@PathVariable("id") int id) {
        return employeeService.delete(id);
    }

    @GetMapping
//    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
