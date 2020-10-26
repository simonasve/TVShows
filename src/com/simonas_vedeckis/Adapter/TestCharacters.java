package com.simonas_vedeckis.Adapter;

public class TestCharacters {

    public static void main(String[] args) {

        MainProtagonist Bob = new MainProtagonist();

        Character Josh = new MainAntagonistAdapter(new MainAntagonist());

        System.out.println("Protagonist:");
        Bob.complimentSomeone();
        Bob.fallInLove("Josh");
        Bob.surpriseAudience();
        System.out.println();

        System.out.println("Antagonist:");
        Josh.complimentSomeone();
        Josh.fallInLove("Bob");
        Josh.surpriseAudience();
    }
}
