package ro.dexterix.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ro.dexterix.entities.Student;
import ro.dexterix.services.StudentService;

import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public String getAllStudents(Model model) {
        List<Student> students = studentService.list();
        model.addAttribute("students", students);

        return "student/index";
    }
    @GetMapping("/students/create")
    public String createStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);

        return "student/create";
    }
    @PostMapping("/students/create")
    public String createStudent(@ModelAttribute("student") Student student) {
        studentService.save(student);

        return "redirect:/students";
    }
}
