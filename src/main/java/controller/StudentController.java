package controller;



import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> students() {
        return studentRepository.findAll();

    }
    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}
