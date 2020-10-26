package com.simonas_vedeckis.Adapter;

public class MainAntagonistAdapter implements Character{

    public MainAntagonist antagonist;

    public MainAntagonistAdapter(MainAntagonist antagonist) {
        this.antagonist = antagonist;
    }

    @Override
    public void complimentSomeone() {
        antagonist.insultSomeone();
    }

    @Override
    public void fallInLove(String loveInterest) {
        antagonist.hate(loveInterest);
    }

    @Override
    public void surpriseAudience() {
        antagonist.makeMajorTwist();
    }
}
