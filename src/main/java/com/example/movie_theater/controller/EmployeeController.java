package com.example.movie_theater.controller;

import com.example.movie_theater.model.Auditorium;
import com.example.movie_theater.model.Employee;
import com.example.movie_theater.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController

public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("employees/")
    public List<Employee> getAllEmployee() {
        return employeeService.getAll();
    }

    @GetMapping("employees/{employeeId}")
    public Optional<Employee> getEmployeeByID(@PathVariable("employeeId") int employeeId) {
        return employeeService.getById(employeeId);
    }
    @DeleteMapping("employees/{employeeId}")
    public void deleteEmployeeById(@PathVariable("employeeId") int employeeId){
        employeeService.delete(employeeId);
    }

    @PutMapping("employees/")
    public List<Employee> createOrUpdateEmployee(@RequestBody List<Employee> employee){
        return employeeService.save(employee);
    }
}
