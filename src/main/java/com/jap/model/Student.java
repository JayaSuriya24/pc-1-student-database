/*
 * Author Name: M Jaya Suriya
 * Date: 9/16/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.model;

import java.util.Objects;

public class Student {
    private int roll_number;
    private String name;
    private char grade;

    public Student() {
    }

    public Student(int roll_number, String name, char grade) {
        this.roll_number = roll_number;
        this.name = name;
        this.grade = grade;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (roll_number != student.roll_number) return false;
        if (grade != student.grade) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = roll_number;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) grade;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" + "roll_number=" + roll_number + ", name='" + name + '\'' + ", grade=" + grade + '}';
    }
}
