package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {
    private final studentService studentService;

    @Autowired    //通过这个autowired 就把上面的studentService magically instanshiated 实例化

    public studentController(com.example.demo.student.studentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<student> getstudents(){
        return studentService.getstudents();
    }
}
