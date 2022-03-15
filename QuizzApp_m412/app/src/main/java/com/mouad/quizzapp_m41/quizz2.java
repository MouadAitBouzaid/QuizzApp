package com.mouad.quizzapp_m41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quizz2 extends AppCompatActivity {
    //Declaration
    private Button next2;
    private RadioGroup Rgroup2;
    private RadioButton answer1;
    private RadioButton answer2;
    private RadioButton correctAns;

    int cpt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz2);
        //Recuperation
        Rgroup2 =findViewById(R.id.group2);
        next2 =findViewById(R.id.Next2);
        answer1=findViewById(R.id.radio21);
        answer2=findViewById(R.id.radio22);

        //Association de listner
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = Rgroup2.getCheckedRadioButtonId();
                correctAns = findViewById(radioId);
                if(correctAns.getText().toString().equals("Oui")){
                    cpt++;
                    startActivity(new Intent(quizz2.this,quizz3.class));
                }else{
                    startActivity(new Intent(quizz2.this,quizz3.class));
                }

            }
        });
    }
}