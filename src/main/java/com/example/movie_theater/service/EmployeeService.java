package com.example.movie_theater.service;

import com.example.movie_theater.model.Auditorium;
import com.example.movie_theater.model.Employee;
import com.example.movie_theater.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public List<Employee> save(List<Employee> employee) {
        return employeeRepository.saveAll(employee);
    }

    public Optional<Employee> getById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }
    public void delete(int employee){
        employeeRepository.deleteById(employee);
    }
}
