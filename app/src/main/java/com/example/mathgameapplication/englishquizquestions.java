package com.example.mathgameapplication;


public class englishquizquestions {

    private String mQuestions [] = {
            "What country did Romeo and Juliet come from?",
            "What is the missing word, I am going to ..... in my car .",
            "The horse ran out of ....... stable? .",
            "How many letters are there in the alphabet.",
            "QUIZ OVER."

    };


    private String mChoices [][] = {
            {"Italy", "England", "China"},
            {"Walk", "Drive", "Paddle"},
            {"Its", "it was", "it is "},
            {"20", "15", "26"},
            {" ", " ", " "},
    };



    private String mCorrectAnswers[] = {"Italy", "Drive", "Its", "26"," "};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}