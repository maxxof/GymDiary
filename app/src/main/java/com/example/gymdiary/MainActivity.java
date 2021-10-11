package com.example.gymdiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStepValue;
    private TextView textViewStep;
    private double step;
    private double i = 0;
    private int j = 0;
    public static final ArrayList<String> diary = new ArrayList();
    public static final ArrayList<String> preset = new ArrayList();

    Exercise exercise1 = new Exercise("Deadlift", 2.5, 5, 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentDay1 = getIntent();
        preset.add(0, "Deadlift");
        preset.add(1, "Bench Press");
        preset.add(2, "Squats");
        preset.add(3, "Overhead Press");
        preset.add(4, "Curls");
        preset.add(5, "Dips");
        preset.add(6, "Rows");
        preset.add(7, "Lat Pulldown");
        preset.add(8, "Crunch");


        TextView tv = findViewById(R.id.editTextEx1name);
        tv.setText(exercise1.getName());

        TextView tv2 = findViewById(R.id.ex1weight);
        tv2.setText(Double.toString(exercise1.getWeight()));

        TextView tv3 = findViewById(R.id.ex1reps);
        tv3.setText(Integer.toString(exercise1.getReps()));



    }

    public void wPlusPressed(View v){
        exercise1.increaseWeight();
        TextView tv = findViewById(R.id.ex1weight);
        tv.setText(Double.toString(exercise1.getWeight()));
    }

    public void wMinusPressed(View v){
        exercise1.decreaseWeight();
        TextView tv = findViewById(R.id.ex1weight);
        tv.setText(Double.toString(exercise1.getWeight()));
    }

    public void rPlusPressed(View v){
        exercise1.increaseReps();
        TextView tv = findViewById(R.id.ex1reps);
        tv.setText(Integer.toString(exercise1.getReps()));
    }

    public void rMinusPressed(View v){
        exercise1.decreaseReps();
        TextView tv = findViewById(R.id.ex1reps);
        tv.setText(Integer.toString(exercise1.getReps()));
    }


      public void ex1addPressed(View v){
        EditText exerET = (EditText) findViewById(R.id.editTextEx1name);
        exercise1.setName(exerET.getText().toString());

        diary.add(exercise1.diaryString());

        i++;


    }

    public void upPressed (View v){
        j++;
        if(j == preset.size()){
            j = 0;
        }
        TextView tv = findViewById(R.id.editTextEx1name);
        tv.setText(preset.get(j));

    }

    public void downPressed (View v){
        j--;
        if(j < 0){
            j = preset.size() - 1;
        }
        TextView tv = findViewById(R.id.editTextEx1name);
        tv.setText(preset.get(j));
    }

    /* public void clearPressed(View v){
        diary.clear();
        i = 0;
        TextView diaryTV = findViewById(R.id.diaryTextView);
        diaryTV.setText("Diary:");
    } */
    public void stepUpPressed(View v) {
        step = exercise1.getStep();
        exercise1.setStep(step + 0.5);
        textViewStepValue.setText(Double.toString(exercise1.getStep()));
    }
    public void stepDownPressed(View v) {
        if (exercise1.getStep() > 0.5) {
            step = exercise1.getStep();
            exercise1.setStep(step - 0.5);
            textViewStepValue.setText(Double.toString(exercise1.getStep()));
        } else
            step = 0.5;
    }
    public void openTracker(View v) {
        Intent intent = new Intent(this, Tracker.class);
        intent.putStringArrayListExtra("DIARY", diary);

        startActivity(intent);
    }
    public void goBack(View v) {
        Intent intentMainScreen = new Intent(this, MainScreen.class);
        startActivity(intentMainScreen);

    }
}