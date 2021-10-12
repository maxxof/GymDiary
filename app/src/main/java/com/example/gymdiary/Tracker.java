package com.example.gymdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class Tracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);
        int i = 0;
        Intent intent = getIntent();
        ArrayList<String> diary = intent.getStringArrayListExtra("DIARY");


        TextView diaryTV  = findViewById(R.id.diaryTextView);
        diaryTV.append("\n" + diary.toString().replace("[","").replace("]", "").replace(",", "\n"));
    }

    public void goBack(View v) {
        Intent intent = new Intent(this, Day1Activity.class);
        startActivity(intent);

    }

}