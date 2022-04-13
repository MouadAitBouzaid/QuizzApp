package com.aitbouzaid.quizapp_c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class testConeection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_coneection);
        Toast.makeText(testConeection.this, "Firebase connection success",Toast.LENGTH_LONG).show();

    }
}