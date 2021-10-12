package com.example.gymdiary;

public class Exercise {
    private String name;
    private double step;
    private int reps;
    private double weight;

    public Exercise(String name, double step, int reps, double weight) {
        this.name = name;
        this.step = step;
        this.reps = reps;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getStep() {
        return step;
    }
    public void setStep(double step) {
        this.step = step;
    }
    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void increaseWeight(){
        this.weight += step;
    }
    public void decreaseWeight(){
        this.weight -= step;
    }
    public void increaseReps(){
        this.reps++;
    }
    public void decreaseReps(){
        this.reps--;
    }

    public String diaryString(){
        return this.name + " " + this.reps + " reps " + this.weight + " kg.";
    }
}