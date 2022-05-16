package com.dung.demoopenshift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/hello")
    public String hello() {
        return "hello world from redhat open shift";
    }

    @GetMapping("/employees")
    public List<Employee> getList() {
        return repository.findAll();
    }

    @PostMapping("/employees")
    public Employee create(@RequestBody Employee employee) {
        return repository.save(employee);
    }
}
