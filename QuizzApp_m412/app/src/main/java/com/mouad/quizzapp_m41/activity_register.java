package com.mouad.quizzapp_m41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_register extends AppCompatActivity {
    //Step 1 : Declaration
    TextView ReturnToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    //Step 2 : Recuperation
        ReturnToLogin=findViewById(R.id.tvRegister2);

    //Step 3 : Association de listners
        ReturnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    //Step 4 : Traitement
                startActivity(new Intent(activity_register.this,MainActivity.class));
            }
        });
    }
}