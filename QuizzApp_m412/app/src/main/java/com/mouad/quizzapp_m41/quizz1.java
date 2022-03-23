package com.mouad.quizzapp_m41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quizz1 extends AppCompatActivity {
    //Declaration
    private Button next1;
    private RadioGroup Rgroup1;
    private RadioButton answer1;
    private RadioButton answer2;
    private RadioButton correctAns;

    int cpt=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz1);
    //Recuperation
        Rgroup1 =findViewById(R.id.group1);
        next1 =findViewById(R.id.Next1);
        answer1=findViewById(R.id.radio1);
        answer2=findViewById(R.id.radio2);

    //Association de listner
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int radioId = Rgroup1.getCheckedRadioButtonId();
            correctAns = findViewById(radioId);
            if(correctAns.getText().toString().equals("Oui")){
                cpt++;

                startActivity(new Intent(quizz1.this,quizz2.class).putExtra("score", cpt));
            }else{
                startActivity(new Intent(quizz1.this,quizz2.class).putExtra("score", cpt));
            }
            }
        });
    }

}