package com.example.mathgameapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class subtractionactivity extends AppCompatActivity {
    TextView tvNum1, tvNum2, tvAns, tvResult;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mathsgameappliction);

        tvNum1 = findViewById(R.id.tv_num_3);
        tvNum2 = findViewById(R.id.tv_num_4);
        tvAns = findViewById(R.id.tv_ans);
        tvResult = findViewById(R.id.tv_result);
        button = findViewById(R.id.button_home);
        run_reset();

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openMathshome();
                finish();
            }
        });
    }

    public void openMathshome() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    void run_reset(){
        Random myRandom = new Random();

        int num1 = myRandom.nextInt(101);
        int num2 = myRandom.nextInt(101);

        tvNum1.setText(""+num1);
        tvNum2.setText(""+num2);

        tvAns.setText("");
        tvResult.setText("");
    }

    void printAns(String a){
        String text = tvAns.getText().toString();
        tvAns.setText(text+a);
    }

    public void one(View view) {
        printAns("1");
    }

    public void two(View view) {
        printAns("2");
    }

    public void three(View view) {
        printAns("3");
    }

    public void four(View view) {
        printAns("4");
    }

    public void five(View view) {
        printAns("5");
    }

    public void six(View view) {
        printAns("6");
    }

    public void seven(View view) {
        printAns("7");
    }

    public void eight(View view) {
        printAns("8");
    }

    public void nine(View view) {
        printAns("9");
    }

    public void zero(View view) {
        printAns("0");
    }

    public void clear(View view) {
        run_reset();
    }

    public void submit(View view) {
        int num1 = Integer.parseInt(tvNum1.getText().toString());
        int num2 = Integer.parseInt(tvNum2.getText().toString());
        int ans = num1 + num2;

        int get_user_ans = Integer.parseInt(tvAns.getText().toString());

        if (ans == get_user_ans){
            tvResult.setText("CORRECT!!");
        }
        else {
            tvResult.setText("INCORRECT!!");
        }
    }
}