package com.tutorial04.tutorial04.repo;

import com.tutorial04.tutorial04.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
