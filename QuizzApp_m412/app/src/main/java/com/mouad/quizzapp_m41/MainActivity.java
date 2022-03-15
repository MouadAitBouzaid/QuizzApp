package com.mouad.quizzapp_m41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declaration
    TextView tregister;
    Button login;
    EditText username;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login= findViewById(R.id.SignIN);
        username=findViewById(R.id.etLogin);
        password=findViewById(R.id.etPassword);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("toto") && password.getText().toString().equals("titi")) {
                    startActivity(new Intent(MainActivity.this, quizz1.class));
                }else {
                    Toast.makeText(getApplicationContext(), "Login ou mot de passe est incorecte !",Toast.LENGTH_SHORT).show();
                }
            }
        });

    tregister=findViewById(R.id.tvRegister);
    tregister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this,activity_register.class));
        }
    });


    }
}