package com.andyslabs.volcano.api_server.administration;


import com.andyslabs.volcano.api_server.model.student.data.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Administration {

    private String student_name;
    private String student_number;

    public Administration(){
       student_name = System.getenv("STUDENT_NAME");
        if (student_name == null) {
            student_name = "Mike Wazowski";
        }
        student_number = System.getenv("STUDENT_NUMBER");
        if (student_number == null) {
            student_number = "n1234567";
        }
    }

    @GetMapping("/me")
    public ResponseEntity<Student> getMe() {
        Student student = new Student(student_name, student_number);
        return ResponseEntity.ok(student);
    }
}
