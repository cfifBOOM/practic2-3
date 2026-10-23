package org.example.repository;

import org.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Репозиторий: работа с базой данных (готовые методы save, findAll и др.)
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
