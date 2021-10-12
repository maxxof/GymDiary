package com.example.gymdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainScreen extends AppCompatActivity {
    private FloatingActionButton floatingButtonPlus, floatingButtonMinus;
    private Button buttonDay1, buttonDay2, buttonDay3, buttonDay4, buttonDay5, buttonDay6;
    private EditText et;
    private View v;
    private TextView textViewNameSession;
    private boolean buttonDay1Visible;

    public static final String SHARED_PREFS = "sp";
    public static final String BUTTONDAY1 = "buttonDay1";
    public static final String BUTTONDAY2 = "buttonDay2";
    public static final String BUTTONDAY3 = "buttonDay3";
    public static final String BUTTONDAY4 = "buttonDay4";
    public static final String BUTTONDAY5 = "buttonDay5";
    public static final String BUTTONDAY6 = "buttonDay6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        Intent intentMainScreen = getIntent();

        floatingButtonPlus = findViewById(R.id.floatingButtonPlus);
        floatingButtonMinus= findViewById(R.id.floatingButtonMinus);
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

        loadData();
        updateViews();
    }

    protected void onStart(){
        super.onStart();
        loadData();

    }
    @Override
    protected void onResume(){
        super.onResume();
        saveData();
    }
    protected void onPause(){
        super.onPause();
        saveData();

    }
    protected void onStop(){
        super.onStop();
        saveData();
    }

    protected void onRestart(){
        super.onRestart();
        saveData();
    }

    protected void onDestroy(){
        super.onDestroy();
    }

    public void saveData() {
        SharedPreferences sp = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        editor.putBoolean(BUTTONDAY1, buttonDay1.isCursorVisible());

        editor.apply();

    }
    public void loadData() {
        SharedPreferences sp = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        buttonDay1Visible = sp.getBoolean(BUTTONDAY1, true);


    }
    public void updateViews() {
        buttonDay1.setCursorVisible(buttonDay1Visible);

    }


    public void plusClick(View view1) {

        if (buttonDay1.getVisibility() == v.INVISIBLE) {
            buttonDay1.setText(et.getText().toString());
            buttonDay1.setVisibility(v.VISIBLE);
        } else if (buttonDay2.getVisibility() == v.INVISIBLE) {
            buttonDay2.setText(et.getText().toString());
            buttonDay2.setVisibility(v.VISIBLE);
        } else if (buttonDay3.getVisibility() == v.INVISIBLE) {
            buttonDay3.setText(et.getText().toString());
            buttonDay3.setVisibility(v.VISIBLE);
        } else if (buttonDay3.getVisibility() == v.INVISIBLE) {
            buttonDay3.setText(et.getText().toString());
            buttonDay3.setVisibility(v.VISIBLE);
        } else if (buttonDay4.getVisibility() == v.INVISIBLE) {
            buttonDay4.setText(et.getText().toString());
            buttonDay4.setVisibility(v.VISIBLE);
        } else if (buttonDay5.getVisibility() == v.INVISIBLE) {
            buttonDay5.setText(et.getText().toString());
            buttonDay5.setVisibility(v.VISIBLE);
        } else if (buttonDay6.getVisibility() == v.INVISIBLE) {
            buttonDay6.setText(et.getText().toString());
            buttonDay6.setVisibility(v.VISIBLE);
        }
        saveData();
    }

    public void minusClick(View view2) {
        if (buttonDay6.getVisibility() == v.VISIBLE) {
            buttonDay6.setVisibility(v.INVISIBLE);
        } else if (buttonDay5.getVisibility() == v.VISIBLE) {
            buttonDay5.setVisibility(v.INVISIBLE);
        } else if (buttonDay4.getVisibility() == v.VISIBLE) {
            buttonDay4.setVisibility(v.INVISIBLE);
        } else if (buttonDay3.getVisibility() == v.VISIBLE) {
            buttonDay3.setVisibility(v.INVISIBLE);
        } else if (buttonDay2.getVisibility() == v.VISIBLE) {
            buttonDay2.setVisibility(v.INVISIBLE);
        } else if (buttonDay1.getVisibility() == v.VISIBLE) {
            buttonDay1.setVisibility(v.INVISIBLE);
        }
        saveData();
    }

    public void buttonDay1Click(View view) {
        Intent intentDay1 = new Intent(this, Day1Activity.class);
        startActivity(intentDay1);

    }

    public void buttonDay2Click(View view) {
        Intent intentDay2 = new Intent(this, Day2Activity.class);
        startActivity(intentDay2);
    }

    public void buttonDay3Click(View view) {
        Intent intentDay3 = new Intent(this, Day3Activity.class);
        startActivity(intentDay3);
    }

    public void buttonDay4Click(View view) {
        Intent intentDay4 = new Intent(this, Day4Activity.class);
        startActivity(intentDay4);
    }

    public void buttonDay5Click(View view) {
        Intent intentDay5 = new Intent(this, Day5Activity.class);
        startActivity(intentDay5);
    }

    public void buttonDay6Click(View view) {
        Intent intentDay6 = new Intent(this, Day6Activity.class);
        startActivity(intentDay6);
    }
}