package com.example.basketballscorecounter;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public MutableLiveData<Integer> scoreTeam1 = new MutableLiveData<>();
    public MutableLiveData<Integer> scoreTeam2 = new MutableLiveData<>();

    public MainViewModel() {
        scoreTeam1.setValue(0);
        scoreTeam2.setValue(0);
    }

    public void add3Team1Score(){
        scoreTeam1.setValue(scoreTeam1.getValue() + 3);
    }

    public void add2Team1Score(){
        scoreTeam1.setValue(scoreTeam1.getValue() + 2);
    }

    public void add1Team1Score(){
        scoreTeam1.setValue(scoreTeam1.getValue() + 1);
    }


    public void add3Team2Score(){
        scoreTeam2.setValue(scoreTeam2.getValue() + 3);
    }

    public void add2Team2Score(){
        scoreTeam2.setValue(scoreTeam2.getValue() + 2);
    }

    public void add1Team2Score(){
        scoreTeam2.setValue(scoreTeam2.getValue() + 1);
    }
    public void resetScore(){
        scoreTeam1.setValue(0);
        scoreTeam2.setValue(0);
    }
}
