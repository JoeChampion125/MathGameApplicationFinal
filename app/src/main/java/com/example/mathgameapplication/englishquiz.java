package com.example.mathgameapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class englishquiz extends AppCompatActivity {

    private englishquizquestions mQuestionLibrary = new englishquizquestions();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button buttonHome;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.englishquiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        buttonHome = (Button)findViewById(R.id.button_Home);

        updateQuestion();


        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(englishquiz.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(englishquiz.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });




        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(englishquiz.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(englishquiz.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });





        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(englishquiz.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(englishquiz.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });




        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHome();
                finish();
            }
        });

    }


    public void openActivityHome() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);


    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}