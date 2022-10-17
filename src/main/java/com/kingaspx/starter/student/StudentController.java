package com.kingaspx.starter.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> list() {
        return studentService.list();
    }

    @PostMapping
    public void create(@RequestBody Student student) {
        studentService.create(student);
    }

    @PutMapping(path="{studentId}")
    public void update(@PathVariable("studentId") Long id, @RequestParam(required = false) String name, @RequestParam(required = false) String email) {
        studentService.update(id, name, email);
    }

    @DeleteMapping(path="{studentId}")
    public void delete(@PathVariable("studentId") Long id) {
        studentService.delete(id);
    }
}
