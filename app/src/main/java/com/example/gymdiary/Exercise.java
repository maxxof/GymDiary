package com.example.gymdiary;

public class Exercise {
    private String name;
    private String units;
    private int step;
    private int reps;
    private int weight;

    public Exercise(String name, String units, int step, int reps, int weight) {
        this.name = name;
        // units is useless we only do kg for now, if we have time we add more units
        this.units = units;
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
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    public int getStep() {
        return step;
    }
    public void setStep(int step) {
        this.step = step;
    }
    public int getReps() {
        return reps;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
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
    } // moimoi
}