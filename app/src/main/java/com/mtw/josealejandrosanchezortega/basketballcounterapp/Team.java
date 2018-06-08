package com.mtw.josealejandrosanchezortega.basketballcounterapp;

public class Team {
    public int totalPoints = 0;

    public void treePointsBasket() {
        totalPoints += 3;
    }

    public void twoPointsBasket() {
        totalPoints += 2;
    }

    public void onePointsBasket() {
        totalPoints++;
    }

    public void resetPoints() {
        totalPoints = 0;
    }

    /* public String getTotalPoints() {
        // return (String)this.totalPoints;
        return String.valueOf(this.totalPoints);
    } */
}
