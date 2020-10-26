package com.simonas_vedeckis.TVShow;

class DramaShow extends TVShow {

    public DramaShow (String title) {
        super(title);
    }

    @Override
    public void watch() {
        viewingTime += 50;
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

        viewersExcitement += 30;
    }
}
