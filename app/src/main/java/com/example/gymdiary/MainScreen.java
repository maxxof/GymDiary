package com.example.gymdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainScreen extends AppCompatActivity {
    private FloatingActionButton floatingButtonPlus;
    private Button buttonDay1, buttonDay2, buttonDay3, buttonDay4, buttonDay5, buttonDay6;
    private EditText et;
    private View v;
    private TextView textViewNameSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        SharedPreferences sh = getSharedPreferences("MySharedPreferences", MODE_PRIVATE);
        floatingButtonPlus = findViewById(R.id.floatingButtonPlus);
        buttonDay1 = findViewById(R.id.buttonDay1);
        buttonDay2 = findViewById(R.id.buttonDay2);
        buttonDay3 = findViewById(R.id.buttonDay3);
        buttonDay4 = findViewById(R.id.buttonDay4);
        buttonDay5 = findViewById(R.id.buttonDay5);
        buttonDay6 = findViewById(R.id.buttonDay6);

        et = findViewById(R.id.editTextName);

        buttonDay1.setVisibility(v.INVISIBLE);
        buttonDay2.setVisibility(v.INVISIBLE);
        buttonDay3.setVisibility(v.INVISIBLE);
        buttonDay4.setVisibility(v.INVISIBLE);
        buttonDay5.setVisibility(v.INVISIBLE);
        buttonDay6.setVisibility(v.INVISIBLE);
    }
    }

    public void plusClick(View view1) {
        if (buttonDay1.getVisibility() == v.INVISIBLE) {
            buttonDay1.setText(et.getText().toString());
            buttonDay1.setVisibility(v.VISIBLE);
        } else

        if (buttonDay2.getVisibility() == v.INVISIBLE) {
            buttonDay2.setText(et.getText().toString());
            buttonDay2.setVisibility(v.VISIBLE);
        } else
        if (buttonDay3.getVisibility() == v.INVISIBLE) {
            buttonDay3.setText(et.getText().toString());
            buttonDay3.setVisibility(v.VISIBLE);
        } else
        if (buttonDay3.getVisibility() == v.INVISIBLE) {
            buttonDay3.setText(et.getText().toString());
            buttonDay3.setVisibility(v.VISIBLE);
        } else
        if (buttonDay4.getVisibility() == v.INVISIBLE) {
            buttonDay4.setText(et.getText().toString());
            buttonDay4.setVisibility(v.VISIBLE);
        } else
        if (buttonDay5.getVisibility() == v.INVISIBLE) {
            buttonDay5.setText(et.getText().toString());
            buttonDay5.setVisibility(v.VISIBLE);
        } else
        if (buttonDay6.getVisibility() == v.INVISIBLE) {
            buttonDay6.setText(et.getText().toString());
            buttonDay6.setVisibility(v.VISIBLE);
        }
    }
    public void minusClick(View view2) {
    
}