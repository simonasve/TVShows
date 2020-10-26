package com.simonas_vedeckis.TVShow;

class SitcomShow extends TVShow {

    public SitcomShow (String title) {
            super(title);
    }

    @Override
    public void watch() {
        viewingTime += 20;
        episode ++;
        showIntro();
    }

    @Override
    public void showIntro() {

        viewersExcitement += 5;
    }

    @Override
    public void watchNextEpisode() {
        watch();

    }

    @Override
    public void showSeasonFinale() {

        viewersExcitement += 40;
    }
}
