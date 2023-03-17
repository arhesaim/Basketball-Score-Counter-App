package com.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button score3Team1btn, score2Team1btn, score1Team1btn, score3Team2btn, score2Team2btn, score1Team2btn, resetbtn;

    private TextView scoreTeam1, scoreTeam2;
    private MainViewModel mainViewModel;

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score3Team1btn = findViewById(R.id.score3Team1btn);
        score3Team2btn = findViewById(R.id.score3Team2btn);
        score2Team1btn = findViewById(R.id.score2Team1btn);
        score2Team2btn = findViewById(R.id.score2Team2btn);
        score1Team1btn = findViewById(R.id.score1Team1btn);
        score1Team2btn = findViewById(R.id.score1Team2btn);
        resetbtn = findViewById(R.id.resetbtn);

        scoreTeam1 = findViewById(R.id.team1Scoretxt);
        scoreTeam2 = findViewById(R.id.team2Scoretxt);

        score3Team1btn.setOnClickListener(onClickListener);
        score3Team2btn.setOnClickListener(onClickListener);
        score2Team1btn.setOnClickListener(onClickListener);
        score2Team2btn.setOnClickListener(onClickListener);
        score1Team1btn.setOnClickListener(onClickListener);
        score1Team2btn.setOnClickListener(onClickListener);
        resetbtn.setOnClickListener(onClickListener);


    }
}