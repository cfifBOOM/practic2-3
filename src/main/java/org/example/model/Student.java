package org.example.model;

import jakarta.persistence.*;

// Модель: этот класс - таблица в базе данных
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "course")
    private Integer course;

    @Column(name = "has_debt")
    private boolean hasDebt;

    public Student() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getCourse() { return course; }
    public void setCourse(Integer course) { this.course = course; }
    public boolean isHasDebt() { return hasDebt; }
    public void setHasDebt(boolean hasDebt) { this.hasDebt = hasDebt; }
}
