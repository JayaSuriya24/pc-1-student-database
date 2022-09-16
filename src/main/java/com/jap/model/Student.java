/*
 * Author Name: M Jaya Suriya
 * Date: 9/16/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.jap.model;

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
}
