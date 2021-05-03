package com.example.mathgameapplication;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class HomePage extends AppCompatActivity {
    private Button buttonAddition;
    private Button buttonMulti;
    private Button buttonsub;
    private Button buttondiv;
    private Button buttonenglish;
    private Button btn_logout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mathshomepage);

        buttonAddition = (Button) findViewById(R.id.button_add);
        buttonMulti = (Button) findViewById(R.id.button_multi);
        buttonsub = (Button) findViewById(R.id.button_subtraction);
        buttondiv = (Button) findViewById(R.id.button_division);
        buttonenglish = (Button) findViewById(R.id.button_english);
        btn_logout = (Button) findViewById(R.id.btn_logout);


        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMain();
                finish();
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLogin();
                finish();
            }
        });



        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMultiplication();
                finish();
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitysub();
                finish();
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitydiv();
                finish();
            }
        });

        buttonenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityenglish();
                finish();
            }
        });

    }


    public void openActivityMain() {
        Intent intent = new Intent(this, Mainactivity.class);
        startActivity(intent);
    }

    public void openActivityMultiplication() {
        Intent intent = new Intent(this, multiplicationactivity.class);
        startActivity(intent);
    }

    public void openActivitysub() {
        Intent intent = new Intent(this, subtractionactivity.class);
        startActivity(intent);
    }

    public void openActivitydiv() {
        Intent intent = new Intent(this, divisionactivity.class);
        startActivity(intent);
    }

    public void openActivityenglish() {
        Intent intent = new Intent(this, englishquiz.class);
        startActivity(intent);
    }

    public void openActivityLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

}
