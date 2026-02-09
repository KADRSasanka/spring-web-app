package com.tutorial04.tutorial04.service;

import com.tutorial04.tutorial04.entity.Student;
import com.tutorial04.tutorial04.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Page<Student> getAllStudents(int page, int size, String sortBy) {
        return studentRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(int id, Student student) {
        Student existing = studentRepository.findById(id).orElseThrow();
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        existing.setBatch(student.getBatch());
        existing.setGpa(student.getGpa());
        return studentRepository.save(existing);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

}
