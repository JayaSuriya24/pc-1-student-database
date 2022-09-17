/*
 * Author Name: M Jaya Suriya
 * Date: 9/16/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.repository;

import com.jap.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public void getAllStudentDetails(Connection connection) throws SQLException {
        String readQuery = "SELECT * FROM `school`.`student`";
        List<Student> studentList = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet studentResultSet = statement.executeQuery(readQuery);
            while (studentResultSet.next()) {
                Student student = new Student();
                student.setRoll_number(studentResultSet.getInt("roll_number"));
                student.setName(studentResultSet.getString("name"));
                student.setGrade(studentResultSet.getString("grade").charAt(0));
                studentList.add(student);
            }
            studentList.forEach(System.out::println);
        }
    }
}
