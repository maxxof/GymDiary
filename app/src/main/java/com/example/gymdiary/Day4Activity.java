package com.example.gymdiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class Day4Activity extends AppCompatActivity {
    private double step;
    private double i = 0;
    private int j = 0;

    public static final ArrayList<String> diary = new ArrayList();
    public static final ArrayList<String> preset = new ArrayList();

    Exercise exercise1 = new Exercise("Deadlift", 2.5, 5, 100);
    Exercise exercise2 = new Exercise("Deadlift", 2.5, 5, 100);
    Exercise exercise3 = new Exercise("Deadlift", 2.5, 5, 100);
    Exercise exercise4 = new Exercise("Deadlift", 2.5, 5, 100);
    Exercise exercise5 = new Exercise("Deadlift", 2.5, 5, 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.day4activity_main);

        Intent intentDay4 = getIntent();


        preset.add(0, "Deadlift");
        preset.add(1, "Bench Press");
        preset.add(2, "Squats");
        preset.add(3, "Overhead Press");
        preset.add(4, "Curls");
        preset.add(5, "Dips");
        preset.add(6, "Rows");
        preset.add(7, "Lat Pulldown");
        preset.add(8, "Crunch");





        TextView ex1tv = findViewById(R.id.editTextEx1name);
        ex1tv.setText(exercise1.getName());

        TextView ex1tv2 = findViewById(R.id.ex1weight);
        ex1tv2.setText(Double.toString(exercise1.getWeight()));

        TextView ex1tv3 = findViewById(R.id.ex1reps);
        ex1tv3.setText(Integer.toString(exercise1.getReps()));


        TextView ex2tv = findViewById(R.id.editTextEx2name);
        ex2tv.setText(exercise2.getName());

        TextView ex2tv2 = findViewById(R.id.ex2weight);
        ex2tv2.setText(Double.toString(exercise2.getWeight()));

        TextView ex2tv3 = findViewById(R.id.ex2reps);
        ex2tv3.setText(Integer.toString(exercise2.getReps()));


        TextView ex3tv = findViewById(R.id.editTextEx3name);
        ex3tv.setText(exercise3.getName());

        TextView ex3tv2 = findViewById(R.id.ex3weight);
        ex3tv2.setText(Double.toString(exercise3.getWeight()));

        TextView ex3tv3 = findViewById(R.id.ex3reps);
        ex3tv3.setText(Integer.toString(exercise3.getReps()));


        TextView ex4tv = findViewById(R.id.editTextEx4name);
        ex4tv.setText(exercise4.getName());

        TextView ex4tv2 = findViewById(R.id.ex4weight);
        ex4tv2.setText(Double.toString(exercise4.getWeight()));

        TextView ex4tv3 = findViewById(R.id.ex4reps);
        ex4tv3.setText(Integer.toString(exercise4.getReps()));


        TextView ex5tv = findViewById(R.id.editTextEx5name);
        ex5tv.setText(exercise5.getName());

        TextView ex5tv2 = findViewById(R.id.ex5weight);
        ex5tv2.setText(Double.toString(exercise5.getWeight()));

        TextView ex5tv3 = findViewById(R.id.ex5reps);
        ex5tv3.setText(Integer.toString(exercise5.getReps()));


    }


    public void wPlusPressed1 (View v){
        exercise1.increaseWeight();
        TextView tv = findViewById(R.id.ex1weight);
        tv.setText(Double.toString(exercise1.getWeight()));
    }
    public void wPlusPressed2 (View v){
        exercise2.increaseWeight();
        TextView tv = findViewById(R.id.ex2weight);
        tv.setText(Double.toString(exercise2.getWeight()));
    }
    public void wPlusPressed3 (View v){
        exercise3.increaseWeight();
        TextView tv = findViewById(R.id.ex3weight);
        tv.setText(Double.toString(exercise3.getWeight()));
    }
    public void wPlusPressed4 (View v){
        exercise4.increaseWeight();
        TextView tv = findViewById(R.id.ex4weight);
        tv.setText(Double.toString(exercise4.getWeight()));
    }
    public void wPlusPressed5 (View v){
        exercise5.increaseWeight();
        TextView tv = findViewById(R.id.ex5weight);
        tv.setText(Double.toString(exercise5.getWeight()));
    }
    public void wMinusPressed1 (View v){
        exercise1.decreaseWeight();
        TextView tv = findViewById(R.id.ex1weight);
        tv.setText(Double.toString(exercise1.getWeight()));
    }
    public void wMinusPressed2 (View v){
        exercise2.decreaseWeight();
        TextView tv = findViewById(R.id.ex2weight);
        tv.setText(Double.toString(exercise2.getWeight()));
    }
    public void wMinusPressed3 (View v){
        exercise3.decreaseWeight();
        TextView tv = findViewById(R.id.ex3weight);
        tv.setText(Double.toString(exercise3.getWeight()));
    }
    public void wMinusPressed4 (View v){
        exercise4.decreaseWeight();
        TextView tv = findViewById(R.id.ex4weight);
        tv.setText(Double.toString(exercise4.getWeight()));
    }
    public void wMinusPressed5 (View v){
        exercise5.decreaseWeight();
        TextView tv = findViewById(R.id.ex5weight);
        tv.setText(Double.toString(exercise5.getWeight()));
    }
    public void rPlusPressed1 (View v){
        exercise1.increaseReps();
        TextView tv = findViewById(R.id.ex1reps);
        tv.setText(Integer.toString(exercise1.getReps()));
    }
    public void rPlusPressed2 (View v){
        exercise2.increaseReps();
        TextView tv = findViewById(R.id.ex2reps);
        tv.setText(Integer.toString(exercise2.getReps()));
    }
    public void rPlusPressed3 (View v){
        exercise3.increaseReps();
        TextView tv = findViewById(R.id.ex3reps);
        tv.setText(Integer.toString(exercise3.getReps()));
    }
    public void rPlusPressed4 (View v){
        exercise4.increaseReps();
        TextView tv = findViewById(R.id.ex4reps);
        tv.setText(Integer.toString(exercise4.getReps()));
    }
    public void rPlusPressed5 (View v){
        exercise5.increaseReps();
        TextView tv = findViewById(R.id.ex5reps);
        tv.setText(Integer.toString(exercise5.getReps()));
    }
    public void rMinusPressed1 (View v){
        exercise1.decreaseReps();
        TextView tv = findViewById(R.id.ex1reps);
        tv.setText(Integer.toString(exercise1.getReps()));
    }
    public void rMinusPressed2 (View v){
        exercise2.decreaseReps();
        TextView tv = findViewById(R.id.ex2reps);
        tv.setText(Integer.toString(exercise2.getReps()));
    }
    public void rMinusPressed3 (View v){
        exercise3.decreaseReps();
        TextView tv = findViewById(R.id.ex3reps);
        tv.setText(Integer.toString(exercise3.getReps()));
    }
    public void rMinusPressed4 (View v){
        exercise4.decreaseReps();
        TextView tv = findViewById(R.id.ex4reps);
        tv.setText(Integer.toString(exercise4.getReps()));
    }
    public void rMinusPressed5 (View v){
        exercise5.decreaseReps();
        TextView tv = findViewById(R.id.ex5reps);
        tv.setText(Integer.toString(exercise5.getReps()));
    }
    public void addPressed1 (View v){
        EditText ex1ET = (EditText) findViewById(R.id.editTextEx1name);
        exercise1.setName(ex1ET.getText().toString());

        diary.add(exercise1.diaryString());

        i++;
    }
    public void addPressed2 (View v){
        EditText ex2ET = (EditText) findViewById(R.id.editTextEx2name);
        exercise2.setName(ex2ET.getText().toString());

        diary.add(exercise2.diaryString());

        i++;
    }
    public void addPressed3 (View v){
        EditText ex3ET = (EditText) findViewById(R.id.editTextEx3name);
        exercise3.setName(ex3ET.getText().toString());

        diary.add(exercise3.diaryString());

        i++;
    }
    public void addPressed4 (View v){
        EditText ex4ET = (EditText) findViewById(R.id.editTextEx4name);
        exercise4.setName(ex4ET.getText().toString());

        diary.add(exercise4.diaryString());

        i++;
    }
    public void addPressed5 (View v){
        EditText ex5ET = (EditText) findViewById(R.id.editTextEx5name);
        exercise5.setName(ex5ET.getText().toString());

        diary.add(exercise5.diaryString());

        i++;
    }
    public void upPressed1 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        TextView tv = findViewById(R.id.editTextEx1name);
        tv.setText(preset.get(j));

    }
    public void upPressed2 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        TextView tv = findViewById(R.id.editTextEx2name);
        tv.setText(preset.get(j));

    }
    public void upPressed3 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        TextView tv = findViewById(R.id.editTextEx3name);
        tv.setText(preset.get(j));

    }
    public void upPressed4 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        TextView tv = findViewById(R.id.editTextEx4name);
        tv.setText(preset.get(j));

    }
    public void upPressed5 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        TextView tv = findViewById(R.id.editTextEx5name);
        tv.setText(preset.get(j));

    }

    public void downPressed1 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        TextView tv = findViewById(R.id.editTextEx1name);
        tv.setText(preset.get(j));
    }
    public void downPressed2 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        TextView tv = findViewById(R.id.editTextEx2name);
        tv.setText(preset.get(j));
    }
    public void downPressed3 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        TextView tv = findViewById(R.id.editTextEx3name);
        tv.setText(preset.get(j));
    }
    public void downPressed4 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        TextView tv = findViewById(R.id.editTextEx4name);
        tv.setText(preset.get(j));
    }
    public void downPressed5 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        TextView tv = findViewById(R.id.editTextEx5name);
        tv.setText(preset.get(j));
    }



    public void openTracker (View v){
        Intent intent = new Intent(this, Tracker.class);
        intent.putStringArrayListExtra("DIARY", diary);
        startActivity(intent);
    }
    public void goBack (View v){
        Intent intentMainScreen = new Intent(this, MainScreen.class);
        startActivity(intentMainScreen);

    }
}