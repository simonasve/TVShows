package com.simonas_vedeckis.TVBuilder;

public class TV implements TVPlan{

    private String TVHousing;
    private String TVScreen;
    private String TVSpeakers;
    private String TVElectronics;

    @Override
    public void setTVHousing(String housing) {

        this.TVHousing = housing;
    }

    @Override
    public void setTVScreen(String screen) {

        this.TVScreen = screen;
    }

    @Override
    public void setTVSpeakers(String speakers) {

        this.TVSpeakers = speakers;
    }

    @Override
    public void setTVElectronics(String electronics) {

        this.TVElectronics = electronics;
    }

    public String getTVHousing() {
        return TVHousing;
    }

    public String getTVScreen() {
        return TVScreen;
    }

    public String getTVSpeakers() {
        return TVSpeakers;
    }

    public String getTVElectronics() {
        return TVElectronics;
    }
}
