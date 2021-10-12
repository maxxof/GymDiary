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

    // Tyhjentää Trackerin clear-napin klikkauksella
    public void clearClicked(View v) {
        diaryTV.setText("");
    }

}