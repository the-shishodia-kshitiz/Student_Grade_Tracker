package com.example.studenttracker;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {
    private final List<Student> students = new ArrayList<>();

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added successfully.";
    }

    @GetMapping
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/summary")
    public SubjectSummary getSummary() {
        if (students.isEmpty()) return new SubjectSummary(0, 0, 0);

        double totalMath = 0, totalScience = 0, totalEnglish = 0;
        for (Student s : students) {
            totalMath += s.getMath();
            totalScience += s.getScience();
            totalEnglish += s.getEnglish();
        }

        int count = students.size();
        return new SubjectSummary(totalMath / count, totalScience / count, totalEnglish / count);
    }
}