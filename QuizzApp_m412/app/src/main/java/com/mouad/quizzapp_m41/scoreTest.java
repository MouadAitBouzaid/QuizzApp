package com.mouad.quizzapp_m41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scoreTest extends AppCompatActivity {

    TextView tv;
    Button btnReturn,btnReplay;

    int cpt=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_test);

        //reccuperation
        tv=findViewById(R.id.tvscore2);
        btnReplay=findViewById(R.id.btnreplay);
        btnReturn=findViewById(R.id.btnlogout);

        Intent intent = getIntent();
        cpt = intent.getIntExtra("score", 0);
        tv.setText(String.valueOf(cpt));

        btnReplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(scoreTest.this,quizz1.class));
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(scoreTest.this,MainActivity.class));
            }
        });





    }
}