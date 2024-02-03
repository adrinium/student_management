package ro.dexterix.services;

import ro.dexterix.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> list();

    Student save(Student student);
}
