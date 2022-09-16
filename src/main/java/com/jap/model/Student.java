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
}
