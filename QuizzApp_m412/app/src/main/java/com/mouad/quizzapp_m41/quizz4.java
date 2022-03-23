package com.mouad.quizzapp_m41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quizz4 extends AppCompatActivity {
    //Declaration
    private Button next4;
    private RadioGroup Rgroup4;
    private RadioButton correctAns4;

    int cpt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz4);
        //Recuperation
        Rgroup4 =findViewById(R.id.group4);
        next4 =findViewById(R.id.Next4);

        Intent intent = getIntent();
        cpt = intent.getIntExtra("score", 0);

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = Rgroup4.getCheckedRadioButtonId();
                correctAns4 = findViewById(radioId);
                if(correctAns4.getText().toString().equals("Oui")){
                    cpt++;
                    startActivity(new Intent(quizz4.this,scoreTest.class).putExtra("score", cpt));
                    System.out.println("exist");
                }else{
                    startActivity(new Intent(quizz4.this,scoreTest.class).putExtra("score", cpt));
                }


            }
        });



    }
}