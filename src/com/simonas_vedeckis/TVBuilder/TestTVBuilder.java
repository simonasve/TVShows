package com.simonas_vedeckis.TVBuilder;

public class TestTVBuilder {

    public static void main(String[] args) {

        TVBuilder oldTV = new OldTVBuilder();

        TVEngineer tvEngineer = new TVEngineer(oldTV);

        tvEngineer.makeTV();

        TV tv = tvEngineer.getTV();

        System.out.println("TV Housing Type: " + tv.getTVHousing());
        System.out.println("TV Screen Type: " + tv.getTVScreen());
        System.out.println("TV Speaker Type: " + tv.getTVSpeakers());
        System.out.println("TV Electronics Type: " + tv.getTVElectronics());
    }
}
