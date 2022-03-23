package com.mouad.quizzapp_m41;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class score extends AppCompatActivity {
    PieChartView pieChartView;
    int score;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);

        System.out.println("score : " + score);
        pieChartView = findViewById(R.id.chartScore);
        List<SliceValue> pieData = new ArrayList<>();

        pieData.add(new SliceValue(score, Color.BLUE));
        pieData.add(new SliceValue(5 - score, Color.GRAY));

        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasCenterCircle(true).setCenterText1(String.valueOf(score + "/5"));
        pieChartView.setPieChartData(pieChartData);
    }
    }
