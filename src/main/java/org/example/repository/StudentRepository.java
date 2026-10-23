package org.example.repository;

import org.example.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

// Репозиторий: работа с базой данных (готовые методы save, findAll и др.)
public interface StudentRepository extends JpaRepository<Student, Long> {
}
