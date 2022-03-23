package com.mouad.quizzapp_m41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quizz3 extends AppCompatActivity {
    //Declaration
    private Button next3;
    private RadioGroup Rgroup3;
    private RadioButton answer31;
    private RadioButton answer32;
    private RadioButton correctAns3;

    int cpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz3);
        //Recuperation
        Rgroup3 =findViewById(R.id.group3);
        next3 =findViewById(R.id.Next3);
        answer31=findViewById(R.id.radio31);
        answer32=findViewById(R.id.radio32);

        Intent intent = getIntent();
        cpt = intent.getIntExtra("score", 0);

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = Rgroup3.getCheckedRadioButtonId();
                correctAns3 = findViewById(radioId);
                if(correctAns3.getText().toString().equals("Oui")){
                cpt++;
                    startActivity(new Intent(quizz3.this,quizz4.class).putExtra("score", cpt));
                }else{
                    startActivity(new Intent(quizz3.this,quizz4.class).putExtra("score", cpt));
                }


            }
        });



    }
}