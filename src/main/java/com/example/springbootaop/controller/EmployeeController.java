package com.example.springbootaop.controller;

import com.example.springbootaop.model.Employee;
import com.example.springbootaop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/employees")
    public ResponseEntity<?> getAllEmployees() {
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

}
