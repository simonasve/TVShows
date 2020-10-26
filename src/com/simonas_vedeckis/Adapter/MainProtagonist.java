package com.simonas_vedeckis.Adapter;

public class MainProtagonist implements Character{

    @Override
    public void complimentSomeone() {
        System.out.println("You look great today!");
    }

    @Override
    public void fallInLove(String loveInterest) {
        System.out.println("I love " + loveInterest + "!");
    }

    @Override
    public void surpriseAudience() {
        System.out.println("This is all just a simulation!");
    }
}
