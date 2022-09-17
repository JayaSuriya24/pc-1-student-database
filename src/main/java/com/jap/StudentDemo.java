package com.jap;

import com.jap.repository.StudentRepository;
import com.jap.service.StudentService;

import java.sql.SQLException;

public class StudentDemo {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        StudentRepository studentRepository = new StudentRepository();
        try {
            studentService.connect();
            studentService.printConnectionStatus();
            System.out.println("-----------------------------------------");
            System.out.println("Student details in the database ");
            System.out.println("-----------------------------------------");
            studentRepository.getAllStudentDetails(studentService.getConnection());
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        }

    }
}
