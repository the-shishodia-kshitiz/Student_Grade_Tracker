package com.example.studenttracker;

public class Student {
    private String name;
    private double math;
    private double science;
    private double english;

    public Student() {}

    public Student(String name, double math, double science, double english) {
        this.name = name;
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getMath() { return math; }
    public void setMath(double math) { this.math = math; }

    public double getScience() { return science; }
    public void setScience(double science) { this.science = science; }

    public double getEnglish() { return english; }
    public void setEnglish(double english) { this.english = english; }
}