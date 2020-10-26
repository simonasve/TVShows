package com.simonas_vedeckis.TVShow;

class FantasyShow extends TVShow {

    public FantasyShow(String title) {
        super(title);
    }

    @Override
    public void watch() {
        viewingTime += 40;
        episode ++;
        showIntro();
    }

    @Override
    public void showIntro() {

        viewersExcitement += 10;
    }

    @Override
    public void watchNextEpisode() {

        watch();
    }

    @Override
    public void showSeasonFinale() {

        viewersExcitement += 50;
    }
    
}
