package com.archis.studentmgmt.service;

import com.archis.studentmgmt.model.Course;
import com.archis.studentmgmt.model.Person;
import com.archis.studentmgmt.model.Student;
import com.archis.studentmgmt.repository.InMemoryRepository;
import com.archis.studentmgmt.util.IdGenerator;

public class RegistrarService {
    private final IdGenerator ids = new IdGenerator();
    private final InMemoryRepository<Person> people = new InMemoryRepository<>();
    private final InMemoryRepository<Student> students = new InMemoryRepository<>();
    private final InMemoryRepository<Course> courses = new InMemoryRepository<>();

    public String status() {
        return "Registrar ready: %d students, %d courses.".formatted(
                students.findAll().size(), courses.findAll().size());
    }
}