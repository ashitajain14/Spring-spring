package com.data.data.controller;

//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.data.model.Department;
import com.data.data.service.DepartmentService;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
//@RequestMapping(value = "/api/department")

public class DepartmentController {
    @Autowired
    private DepartmentService service;
    // @PostMapping
    @PostMapping("/api/department")
    private Department saveDepartment(@RequestBody Department department)
    {
        System.out.println(department);
         return service.saveDepartment(department);
    }
    
}