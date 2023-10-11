package org.example.service;

import org.example.data_access.StudentDao;
import org.example.model.Student;
import org.example.util.UserInputService;
import org.springframework.stereotype.Component;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {
    private UserInputService userInputService;
    private StudentDao studentDao;

    public StudentManagementConsoleImpl(UserInputService userInputService, StudentDao studentDao) {
        this.userInputService = userInputService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        int id = userInputService.getInt();
        String name = userInputService.getString();
        Student createdStudent = new Student(name, id);
        return createdStudent;
    }

    @Override
    public Student save(Student student) {
        if (student != null) {
            studentDao.save(student);
            return student;
        }
        throw new IllegalArgumentException("Student cannot be null.");
    }

    @Override
    public Student find(int id) {
        if (id != 0) {
            studentDao.find(id);
            return new Student(id);
        }
        throw new IllegalArgumentException("Id cannot be null.");

    }

    @Override
    public Student remove(int id) {
        studentDao.delete(id);
        return new Student(id);
    }

    @Override
    public void findAll() {
        studentDao.findAll();

    }

    @Override
    public Student edit(Student student) {
       if (student != null) {
           int id = student.getId();
           String newName = userInputService.getString();
           student.setName(newName);
           studentDao.save(student);
           return student;
       }
       throw new IllegalArgumentException("Student cannot be null.");
    }
}
