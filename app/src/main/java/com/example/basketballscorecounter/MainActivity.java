package com.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

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
            switch (v.getId()){
                case R.id.score3Team1btn:
                    addTeam1(R.id.score3Team1btn);
                    break;
                case R.id.score2Team1btn:
                    addTeam1(R.id.score2Team1btn);
                    break;
                case R.id.score1Team1btn:
                    addTeam1(R.id.score1Team1btn);
                    break;
                case R.id.score3Team2btn:
                    addTeam2(R.id.score3Team2btn);
                    break;
                case R.id.score2Team2btn:
                    addTeam2(R.id.score2Team2btn);
                    break;
                case R.id.score1Team2btn:
                    addTeam2(R.id.score1Team2btn);
                    break;
                case R.id.resetbtn:
                    resetScore();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mainViewModel.scoreTeam1.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                scoreTeam1.setText(String.valueOf(mainViewModel.scoreTeam1.getValue()));
            }
        });
        mainViewModel.scoreTeam2.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                scoreTeam2.setText(String.valueOf(mainViewModel.scoreTeam2.getValue()));
            }
        });

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

    public void addTeam1(int id){
        if (id == R.id.score3Team1btn){
            mainViewModel.add3Team1Score();
        } else if (id == R.id.score2Team1btn){
            mainViewModel.add2Team1Score();
        } else if (id == R.id.score1Team1btn){
            mainViewModel.add1Team1Score();
        }
    }

    public void addTeam2(int id){
        if (id == R.id.score3Team2btn){
            mainViewModel.add3Team2Score();
        } else if (id == R.id.score2Team2btn){
            mainViewModel.add2Team2Score();
        } else if (id == R.id.score1Team2btn){
            mainViewModel.add1Team2Score();
        }
    }

    public void resetScore(){
        mainViewModel.resetScore();
    }
}