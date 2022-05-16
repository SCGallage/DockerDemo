package com.docker.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Sanka Gallage"),
            new Student(2, "Pamudu Ratnayake"),
            new Student(3, "Pasindu Bhagya")
    );

    @GetMapping("/")
    public List<Student> sendCustomerName() {
        return STUDENTS;
    }

}
