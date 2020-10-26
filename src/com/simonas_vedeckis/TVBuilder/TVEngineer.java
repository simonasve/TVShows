package com.simonas_vedeckis.TVBuilder;

public class TVEngineer {

    private final TVBuilder tvBuilder;

    public TVEngineer (TVBuilder tvBuilder) {

        this.tvBuilder = tvBuilder;
    }

    public TV getTV() {
        return this.tvBuilder.getTV();
    }

    public void makeTV() {
        this.tvBuilder.buildTVHousing();
        this.tvBuilder.buildTVScreen();
        this.tvBuilder.buildTVSpeakers();
        this.tvBuilder.buildTVElectronics();
    }
}
