package com.aitbouzaid.quizapp_c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Score extends AppCompatActivity {
    ProgressBar progressBar;
    TextView tvScore;
    Button btnLogOut;
    FirebaseAuth mAuth;
    int score;
    Button btnretry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        tvScore =(TextView) findViewById(R.id.tvScore);
        progressBar=(ProgressBar) findViewById(R.id.progressBar);
        Intent intent=getIntent();
        score=intent.getIntExtra("score",0) ;
        progressBar.setProgress(100*score/5);
        tvScore.setText(100*score/5+" %");
        btnLogOut = findViewById(R.id.btnLogout);
        mAuth = FirebaseAuth.getInstance();
        btnretry= findViewById(R.id.bTry);


        btnretry.setOnClickListener(view ->{
            startActivity(new Intent(Score.this, Quiz1.class));
        });
        btnLogOut.setOnClickListener(view ->{
            mAuth.signOut();
            startActivity(new Intent(Score.this, Login.class));
        });
    }
}