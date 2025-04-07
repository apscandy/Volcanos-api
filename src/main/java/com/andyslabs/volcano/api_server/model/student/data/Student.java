package com.andyslabs.volcano.api_server.model.student.data;

public class Student {
    public String name;
    private String student_number;

    public Student(String name, String student_number) {
        this.name = name;
        this.student_number = student_number;
    }

    public String getName() {
        return name;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
}
