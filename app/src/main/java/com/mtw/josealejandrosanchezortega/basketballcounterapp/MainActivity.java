package com.mtw.josealejandrosanchezortega.basketballcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Team teamA = new Team();
    Team teamB = new Team();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn3PAOnClick(View view) {
        teamA.treePointsBasket();
        this.setScoreTeamA();
    }

    public void btn2PAOnClick(View view) {
        teamA.twoPointsBasket();
        this.setScoreTeamA();
    }

    public void btnFTAOnClick(View view) {
        teamA.onePointsBasket();
        this.setScoreTeamA();
    }

    public void btn3PBOnClick(View view) {
        teamB.treePointsBasket();
        this.setScoreTeamB();
    }

    public void btn2PBOnClick(View view) {
        teamB.twoPointsBasket();
        this.setScoreTeamB();
    }

    public void btnFTBOnClick(View view) {
        teamB.onePointsBasket();
        this.setScoreTeamB();
    }

    private void setScoreTeamA() {
        ((TextView)findViewById(R.id.txtScoreA)).setText(String.valueOf(teamA.totalPoints));
    }

    private void setScoreTeamB() {
        ((TextView)findViewById(R.id.txtScoreB)).setText(String.valueOf(teamB.totalPoints));
    }

    public void btnResetOnClick(View view) {
        teamA.resetPoints();
        ((TextView)findViewById(R.id.txtScoreA)).setText("0");

        teamB.resetPoints();
        ((TextView)findViewById(R.id.txtScoreB)).setText("0");
    }
}
