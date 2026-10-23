package org.example.controller;

import org.example.model.Student;
import org.example.service.StudentService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// Контроллер: принимает HTTP-запросы
@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private boolean notLoggedIn(HttpSession session) {
        return session.getAttribute("loggedIn") == null;
    }

    @GetMapping
    public String list(HttpSession session, Model model) {
        if (notLoggedIn(session)) return "redirect:/login";
        model.addAttribute("students", studentService.getAllStudents());
        return "students-list";
    }

    @GetMapping("/add")
    public String addForm(HttpSession session, Model model) {
        if (notLoggedIn(session)) return "redirect:/login";
        model.addAttribute("student", new Student());
        return "students-form";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Student student, HttpSession session) {
        if (notLoggedIn(session)) return "redirect:/login";
        studentService.saveStudent(student);
        return "redirect:/students";
    }
}
