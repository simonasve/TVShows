package com.simonas_vedeckis.TVShow;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class TVShowNetwork implements Network, Serializable {

    double revenue = 0;
    int totalWatchTime = 0;

    private HashSet<TVShow> tvShows = new HashSet<>();

    @Override
    public void addTVShow(TVShow show) {
        tvShows.add(show);
    }

    @Override
    public Collection<TVShow> getTVShows() {
        return Collections.unmodifiableSet(tvShows);
    }

    @Override
    public void countRevenue() {
        double temp = 0;
        for (TVShow tvShow : tvShows) {
            temp = temp + (((tvShow.getViewersExcitement())) / 100.00) * 4.5;
        }
        revenue = temp;
    }

    @Override
    public double getRevenue() {
        return revenue;
    }

    @Override
    public boolean compareRatings () {
        for (TVShow tvShow : tvShows) {
            totalWatchTime = totalWatchTime + tvShow.viewingTime;
        }

        return totalWatchTime >= 200 && revenue >= 5.00;
    }
}
