package com.example.mathgameapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends AppCompatActivity  {
    Button b1;
    EditText ed1,ed2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        b1 = (Button)findViewById(R.id.btn_login);
        ed1 = (EditText)findViewById(R.id.et_name);
        ed2 = (EditText)findViewById(R.id.et_password);
        tx1 = (TextView)findViewById(R.id.tv_no_attempts);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "Logging In......",Toast.LENGTH_SHORT).show();
                    openActivityHome();
                }else{
                    Toast.makeText(getApplicationContext(), "Incorrect Username or Password",Toast.LENGTH_SHORT).show();

                            tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.BLUE);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
            }
        });


    }

    public void openActivityHome(){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);

    }

}