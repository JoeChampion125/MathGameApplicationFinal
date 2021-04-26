package com.example.mathgameapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class multiplicationactivity extends AppCompatActivity {
    TextView tvNum3, tvNum4, tvAns1, tvResult1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplicationactivity);

        tvNum3 = findViewById(R.id.tv_num_7);
        tvNum4 = findViewById(R.id.tv_num_8);
        tvAns1 = findViewById(R.id.tv_ans);
        tvResult1 = findViewById(R.id.tv_result);
        button1 = findViewById(R.id.button_home1);

        run_reset();

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                openMathshome();

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

        tvNum3.setText(""+num1);
        tvNum4.setText(""+num2);

        tvAns1.setText("");
        tvResult1.setText("");
    }


    void printAns(String a){
        String text = tvAns1.getText().toString();
        tvAns1.setText(text+a);
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
        int num1 = Integer.parseInt(tvNum3.getText().toString());
        int num2 = Integer.parseInt(tvNum4.getText().toString());
        int ans = num1*num2;

        int get_user_ans = Integer.parseInt(tvAns1.getText().toString());

        if (ans == get_user_ans){
            tvResult1.setText("CORRECT!!");
        }
        else {
            tvResult1.setText("INCORRECT!!");
        }
    }
}