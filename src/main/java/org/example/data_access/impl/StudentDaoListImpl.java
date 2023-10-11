package org.example.data_access.impl;

import org.example.data_access.StudentDao;
import org.example.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students;

    public StudentDaoListImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        for (Student student : students) {
            if (student.getId() == id) return student;
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void delete(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
