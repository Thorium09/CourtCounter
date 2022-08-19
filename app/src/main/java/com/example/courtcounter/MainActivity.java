package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void three(View view){
        score = score+3;
        displayForTeamA(score);
    }
    public void threeB(View view){
        scoreB = scoreB+3;
        displayForTeamB(scoreB);
    }
    public void two(View view){
        score = score+2;
        displayForTeamA(score);
    }
    public void twoB(View view){
        scoreB = scoreB+2;
        displayForTeamB(scoreB);
    }
    public void ft(View view ){
        score = score+1;
        displayForTeamA(score);
    }
    public void ftB(View view ){
        scoreB = scoreB+1;
        displayForTeamB(scoreB);
    }
    public void reset(View view){
        score = 0;
        scoreB = 0;
        displayForTeamA(score);
        displayForTeamB(scoreB);
    }
}