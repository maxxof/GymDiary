package com.example.gymdiary;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sp;
    TextView ex1weight;
    String weightStr;

    int i = 0;
   int j = 0;
   public static ArrayList<String> diary = new ArrayList();
   public static final ArrayList<String> preset = new ArrayList();


    Exercise exercise1 = new Exercise("Deadlift", "kg", 5, 5, 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        preset.add(0, "Deadlift");
        preset.add(1, "Bench Press");
        preset.add(2, "Squats");
        preset.add(3, "Overhead Press");
        preset.add(4, "Curls");
        preset.add(5, "Dips");
        preset.add(6, "Rows");
        preset.add(7, "Lat Pulldown");
        preset.add(8, "Crunch");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv = findViewById(R.id.editTextEx1name);
        tv.setText(exercise1.getName());

        TextView tv2 = findViewById(R.id.ex1weight);
        tv2.setText(Integer.toString(exercise1.getWeight()) + " " + exercise1.getUnits());

        TextView tv3 = findViewById(R.id.ex1reps);
        tv3.setText(Integer.toString(exercise1.getReps()));

        diary.removeAll(diary);
    }

    public void onPause() {
        super.onPause();

    }

    public void wPlusPressed(View v){
        exercise1.increaseWeight();
        TextView tv = findViewById(R.id.ex1weight);
        tv.setText(Integer.toString(exercise1.getWeight()) + " " + exercise1.getUnits());
    }

    public void wMinusPressed(View v){
        exercise1.decreaseWeight();
        TextView tv = findViewById(R.id.ex1weight);
        tv.setText(Integer.toString(exercise1.getWeight()) + " " + exercise1.getUnits());
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


    public void openTracker(View v) {
        Intent intent = new Intent(this, Tracker.class);
        intent.putStringArrayListExtra("DIARY", diary);

        startActivity(intent);

    }
    @Override
    public void onStop() {
        super.onStop();

    }
}