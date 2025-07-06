package com.example.studenttracker;

public class SubjectSummary {
    private double mathAverage;
    private double scienceAverage;
    private double englishAverage;

    public SubjectSummary(double mathAverage, double scienceAverage, double englishAverage) {
        this.mathAverage = mathAverage;
        this.scienceAverage = scienceAverage;
        this.englishAverage = englishAverage;
    }

    public double getMathAverage() { return mathAverage; }
    public void setMathAverage(double mathAverage) { this.mathAverage = mathAverage; }

    public double getScienceAverage() { return scienceAverage; }
    public void setScienceAverage(double scienceAverage) { this.scienceAverage = scienceAverage; }

    public double getEnglishAverage() { return englishAverage; }
    public void setEnglishAverage(double englishAverage) { this.englishAverage = englishAverage; }
}