package org.example.service;

import org.example.model.Student;

public interface StudentManagement {
    Student create();
    Student save(Student student);
    Student find(int id);
    Student remove(int id);
    void findAll();
    Student edit(Student student);
}
