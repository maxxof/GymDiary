package com.example.gymdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Tracker extends AppCompatActivity {

    EditText diaryTV;
    Button clear;
    SharedPreferences sp;
    String diaryStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        diaryTV = findViewById(R.id.diaryTextView);
        clear = findViewById(R.id.clearButton);

        SharedPreferences sp = getApplicationContext().getSharedPreferences("diaryPrefs", Context.MODE_PRIVATE);
        String saved = sp.getString("diary", "");

        Intent intent = getIntent();
        ArrayList<String> diary = intent.getStringArrayListExtra("DIARY");

        diaryTV.append(diary.toString().replace("[","").replace("]", "").replace(",", "\n"));
        diaryTV.setText(saved);
        if(diaryTV == null)
            diaryTV.append(diary.toString().replace("[","").replace("]", "").replace(",", "\n"));
        if(diaryTV != null);
        diaryTV.append("\n" + diary.toString().replace("[","").replace("]", "").replace(",", "\n"));


    }
    // Tallentaa Trackerin sisällön
    @Override
    public void onStop() {
        super.onStop();

        sp = getSharedPreferences("diaryPrefs", Context.MODE_PRIVATE);

        diaryStr = diaryTV.getText().toString();
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("diary", diaryStr);
        editor.commit();

    }
    // Siirtyy takaisin sessioniin
    public void goBack(View v) {
        if (getIntent().getStringExtra("from").equals("Day1Activity")){
            Intent intentDay1 = new Intent(this, Day1Activity.class);
            startActivity(intentDay1);
        } else if (getIntent().getStringExtra("from").equals("Day2Activity")){
            Intent intentDay2 = new Intent(this, Day2Activity.class);
            startActivity(intentDay2);
        } else if (getIntent().getStringExtra("from").equals("Day3Activity")){
            Intent intentDay3 = new Intent(this, Day3Activity.class);
            startActivity(intentDay3);
        } else if (getIntent().getStringExtra("from").equals("Day4Activity")) {
            Intent intentDay4 = new Intent(this, Day4Activity.class);
            startActivity(intentDay4);
        } else if (getIntent().getStringExtra("from").equals("Day5Activity")) {
            Intent intentDay5 = new Intent(this, Day5Activity.class);
            startActivity(intentDay5);
        } else if (getIntent().getStringExtra("from").equals("Day6Activity")) {
            Intent intentDay6 = new Intent(this, Day6Activity.class);
            startActivity(intentDay6);
        }

    }

    // Tyhjentää Trackerin clear-napin klikkauksella
    public void clearClicked(View v) {
        diaryTV.setText("");
    }

}