package com.simonas_vedeckis.TVBuilder;

public class OldTVBuilder implements TVBuilder {

    private final TV tv;

    public OldTVBuilder() {
        this.tv = new TV();
    }

    @Override
    public void buildTVHousing() {
        tv.setTVHousing("Bulky Housing");
    }

    @Override
    public void buildTVScreen() {
        tv.setTVScreen("Black And White Screen");
    }

    @Override
    public void buildTVSpeakers() {
        tv.setTVSpeakers("Old-Sounding Speakers");
    }

    @Override
    public void buildTVElectronics() {
        tv.setTVElectronics("Old Circuit Board");
    }

    @Override
    public TV getTV() {
        return this.tv;
    }


}
