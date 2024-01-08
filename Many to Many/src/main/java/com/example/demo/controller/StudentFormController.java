package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentFormController {

    @Autowired
    private StudentService service;

    @PostMapping(path = "/save")
    private Long saveStudent(@RequestBody Student dto) {
        Long add = service.add(dto);
        return add;
    }

}
