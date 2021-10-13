package com.example.gymdiary;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class Day1Activity extends AppCompatActivity {
    private double step;
    private double i = 0;
    private int j = 0;
    private EditText editTextEx1Name, editTextEx2Name, editTextEx3Name, editTextEx4Name, editTextEx5Name;

    private TextView ex1weight, ex1reps, ex2weight, ex2reps, ex3weight, ex3reps, ex4weight, ex4reps, ex5weight, ex5reps;
    private String ex1tv, ex1tv2, ex1tv3, ex2tv, ex2tv2, ex2tv3, ex3tv, ex3tv2, ex3tv3, ex4tv, ex4tv2, ex4tv3, ex5tv, ex5tv2, ex5tv3;
    public static final ArrayList<String> diary = new ArrayList();
    public static final ArrayList<String> preset = new ArrayList();
    public static final String SHARED_PREFS = "sp";
    public static final String NAME1 = "name1";
    public static final String NAME2 = "name2";
    public static final String NAME3 = "name3";
    public static final String NAME4 = "name4";
    public static final String NAME5 = "name5";
    public static final String TEXTWEIGHT1 = "tw1";
    public static final String TEXTWEIGHT2 = "tw2";
    public static final String TEXTWEIGHT3 = "tw3";
    public static final String TEXTWEIGHT4 = "tw4";
    public static final String TEXTWEIGHT5 = "tw5";
    public static final String TEXTREPS1 = "tr1";
    public static final String TEXTREPS2 = "tr2";
    public static final String TEXTREPS3 = "tr3";
    public static final String TEXTREPS4 = "tr4";
    public static final String TEXTREPS5 = "tr5";

    Exercise exercise1 = new Exercise("Deadlift", 2.5, 5, 100);
    Exercise exercise2 = new Exercise("Deadlift", 2.5, 5, 100);
    Exercise exercise3 = new Exercise("Deadlift", 2.5, 5, 100);
    Exercise exercise4 = new Exercise("Deadlift", 2.5, 5, 100);
    Exercise exercise5 = new Exercise("Deadlift", 2.5, 5, 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1activity_main);

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


        editTextEx1Name = findViewById(R.id.editTextEx1name);

        ex1weight = findViewById(R.id.ex1weight);
        ex1weight.setText(Double.toString(exercise1.getWeight()));

        ex1reps = findViewById(R.id.ex1reps);
        ex1reps.setText(Integer.toString(exercise1.getReps()));


        editTextEx2Name = findViewById(R.id.editTextEx2name);
        editTextEx2Name.setText(exercise2.getName());

        ex2weight = findViewById(R.id.ex2weight);
        ex2weight.setText(Double.toString(exercise2.getWeight()));

        ex2reps = findViewById(R.id.ex2reps);
        ex2reps.setText(Integer.toString(exercise2.getReps()));


        editTextEx3Name = findViewById(R.id.editTextEx3name);
        editTextEx3Name.setText(exercise3.getName());

        ex3weight = findViewById(R.id.ex3weight);
        ex3weight.setText(Double.toString(exercise3.getWeight()));

        ex3reps = findViewById(R.id.ex3reps);
        ex3reps.setText(Integer.toString(exercise3.getReps()));


        editTextEx4Name = findViewById(R.id.editTextEx4name);
        editTextEx4Name.setText(exercise4.getName());

        ex4weight = findViewById(R.id.ex4weight);
        ex4weight.setText(Double.toString(exercise4.getWeight()));

        ex4reps = findViewById(R.id.ex4reps);
        ex4reps.setText(Integer.toString(exercise4.getReps()));


        editTextEx5Name = findViewById(R.id.editTextEx5name);
        editTextEx5Name.setText(exercise5.getName());

        ex5weight = findViewById(R.id.ex5weight);
        ex5weight.setText(Double.toString(exercise5.getWeight()));

        ex5reps = findViewById(R.id.ex5reps);
        ex5reps.setText(Integer.toString(exercise5.getReps()));




        loadData();
        updateViews();

    }
    @Override
    public void onStop() {
        super.onStop();
        saveData();


    }
    @Override
    public void onStart() {
        super.onStart();
        loadData();
        updateViews();
    }
    @Override
    public void onResume() {
        super.onResume();
        loadData();
        updateViews();
    }

    public void saveData() {
        SharedPreferences sp = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putString(NAME1, editTextEx1Name.getText().toString());
        editor.putString(TEXTWEIGHT1, ex1weight.getText().toString());
        editor.putString(TEXTREPS1, ex1reps.getText().toString());

        editor.putString(NAME2, editTextEx2Name.getText().toString());
        editor.putString(TEXTWEIGHT2, ex2weight.getText().toString());
        editor.putString(TEXTREPS2, ex2reps.getText().toString());

        editor.putString(NAME3, editTextEx3Name.getText().toString());
        editor.putString(TEXTWEIGHT3, ex3weight.getText().toString());
        editor.putString(TEXTREPS3, ex3reps.getText().toString());

        editor.putString(NAME4, editTextEx4Name.getText().toString());
        editor.putString(TEXTWEIGHT4, ex4weight.getText().toString());
        editor.putString(TEXTREPS4, ex4reps.getText().toString());

        editor.putString(NAME5, editTextEx5Name.getText().toString());
        editor.putString(TEXTWEIGHT5, ex5weight.getText().toString());
        editor.putString(TEXTREPS5, ex5reps.getText().toString());
    }

    public void loadData() {
        SharedPreferences sp = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        ex1tv = sp.getString(NAME1, "");
        ex1tv2 = sp.getString(TEXTWEIGHT1, "");
        ex1tv3 = sp.getString(TEXTREPS1, "");

        ex2tv = sp.getString(NAME2, "");
        ex2tv2 = sp.getString(TEXTWEIGHT2, "");
        ex2tv3 = sp.getString(TEXTREPS2, "");

        ex3tv = sp.getString(NAME3, "");
        ex3tv2 = sp.getString(TEXTWEIGHT3, "");
        ex3tv3 = sp.getString(TEXTREPS3, "");

        ex4tv = sp.getString(NAME4, "");
        ex4tv2 = sp.getString(TEXTWEIGHT4, "");
        ex4tv3 = sp.getString(TEXTREPS4, "");

        ex5tv = sp.getString(NAME5, "");
        ex5tv2 = sp.getString(TEXTWEIGHT5, "");
        ex5tv3 = sp.getString(TEXTREPS5, "");
    }
    public void updateViews() {
        editTextEx1Name.setText(ex1tv);
        ex1weight.setText(ex1tv2);
        ex1reps.setText(ex1tv3);

        editTextEx2Name.setText(ex2tv);
        ex2weight.setText(ex2tv2);
        ex2reps.setText(ex2tv3);

        editTextEx3Name.setText(ex3tv);
        ex3weight.setText(ex3tv2);
        ex3reps.setText(ex3tv3);

        editTextEx4Name.setText(ex4tv);
        ex4weight.setText(ex4tv2);
        ex4reps.setText(ex4tv3);

        editTextEx5Name.setText(ex5tv);
        ex5weight.setText(ex5tv2);
        ex5reps.setText(ex5tv3);

    }


    public void wPlusPressed1 (View v){
        exercise1.increaseWeight();
        ex1weight.setText(Double.toString(exercise1.getWeight()));
    }
    public void wPlusPressed2 (View v){
        exercise2.increaseWeight();
        ex2weight.setText(Double.toString(exercise2.getWeight()));
    }
    public void wPlusPressed3 (View v){
        exercise3.increaseWeight();
        ex3weight.setText(Double.toString(exercise3.getWeight()));
    }
    public void wPlusPressed4 (View v){
        exercise4.increaseWeight();
        ex4weight.setText(Double.toString(exercise4.getWeight()));
    }
    public void wPlusPressed5 (View v){
        exercise5.increaseWeight();
        ex5weight.setText(Double.toString(exercise5.getWeight()));
    }
    public void wMinusPressed1 (View v){
        exercise1.decreaseWeight();
        ex1weight.setText(Double.toString(exercise1.getWeight()));
    }
    public void wMinusPressed2 (View v){
        exercise2.decreaseWeight();
        ex2weight.setText(Double.toString(exercise2.getWeight()));
    }
    public void wMinusPressed3 (View v){
        exercise3.decreaseWeight();
        ex3weight.setText(Double.toString(exercise3.getWeight()));
    }
    public void wMinusPressed4 (View v){
        exercise4.decreaseWeight();
        ex4weight.setText(Double.toString(exercise4.getWeight()));
    }
    public void wMinusPressed5 (View v){
        exercise5.decreaseWeight();
        ex5weight.setText(Double.toString(exercise5.getWeight()));
    }
    public void rPlusPressed1 (View v){
        exercise1.increaseReps();
        ex1reps.setText(Integer.toString(exercise1.getReps()));
    }
    public void rPlusPressed2 (View v){
        exercise2.increaseReps();
        ex2reps.setText(Integer.toString(exercise2.getReps()));
    }
    public void rPlusPressed3 (View v){
        exercise3.increaseReps();
        ex3reps.setText(Integer.toString(exercise3.getReps()));
    }
    public void rPlusPressed4 (View v){
        exercise4.increaseReps();
        ex4reps.setText(Integer.toString(exercise4.getReps()));
    }
    public void rPlusPressed5 (View v){
        exercise5.increaseReps();
        ex5reps.setText(Integer.toString(exercise5.getReps()));
    }
    public void rMinusPressed1 (View v){
        exercise1.decreaseReps();
        ex1reps.setText(Integer.toString(exercise1.getReps()));
    }
    public void rMinusPressed2 (View v){
        exercise2.decreaseReps();
        ex2reps.setText(Integer.toString(exercise2.getReps()));
    }
    public void rMinusPressed3 (View v){
        exercise3.decreaseReps();
        ex3reps.setText(Integer.toString(exercise3.getReps()));
    }
    public void rMinusPressed4 (View v){
        exercise4.decreaseReps();
        ex4reps.setText(Integer.toString(exercise4.getReps()));
    }
    public void rMinusPressed5 (View v){
        exercise5.decreaseReps();
        ex5reps.setText(Integer.toString(exercise5.getReps()));
    }
    public void addPressed1 (View v){
        exercise1.setName(editTextEx1Name.getText().toString());

        diary.add(exercise1.diaryString());

        i++;
        saveData();
    }
    public void addPressed2 (View v){
        exercise2.setName(editTextEx2Name.getText().toString());

        diary.add(exercise2.diaryString());

        i++;
        saveData();

    }
    public void addPressed3 (View v){
        exercise3.setName(editTextEx3Name.getText().toString());

        diary.add(exercise3.diaryString());

        i++;
        saveData();

    }
    public void addPressed4 (View v){
        exercise4.setName(editTextEx4Name.getText().toString());

        diary.add(exercise4.diaryString());

        i++;
        saveData();

    }
    public void addPressed5 (View v){
        exercise5.setName(editTextEx5Name.getText().toString());

        diary.add(exercise5.diaryString());

        i++;
        saveData();

    }
    public void upPressed1 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        editTextEx1Name.setText(preset.get(j));

    }
    public void upPressed2 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        editTextEx2Name.setText(preset.get(j));

    }
    public void upPressed3 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        editTextEx3Name.setText(preset.get(j));

    }
    public void upPressed4 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        editTextEx4Name.setText(preset.get(j));

    }
    public void upPressed5 (View v){
        j++;
        if (j == preset.size()) {
            j = 0;
        }
        editTextEx5Name.setText(preset.get(j));

    }

    public void downPressed1 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        editTextEx1Name.setText(preset.get(j));
    }
    public void downPressed2 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        editTextEx2Name.setText(preset.get(j));
    }
    public void downPressed3 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        editTextEx3Name.setText(preset.get(j));
    }
    public void downPressed4 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        editTextEx4Name.setText(preset.get(j));
    }
    public void downPressed5 (View v){
        j--;
        if (j < 0) {
            j = preset.size() - 1;
        }
        editTextEx5Name.setText(preset.get(j));
    }



    public void openTracker (View v){
        Intent intent = new Intent(this, Tracker.class);
        intent.putStringArrayListExtra("DIARY", diary);
        intent.putExtra("from","Day1Activity");
        startActivity(intent);
    }
    public void goBack (View v){
        Intent intentMainScreen = new Intent(this, MainScreen.class);
        startActivity(intentMainScreen);

    }
}