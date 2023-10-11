package org.example.model;

public class Student {
    private int id;
    private String name;

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
