package com.simonas_vedeckis.TVShow;

import com.simonas_vedeckis.IO.EpisodeException;

import java.io.Serializable;
import java.util.Objects;

/**
 * Represents a named TV show.
 *
 * Implements proper equality based on the title of the TV show.
 */
public abstract class TVShow implements Serializable {

    String title;
    int viewingTime = 0;
    int viewersExcitement = 0;
    int episode = 0;

    public TVShow (String title) {
        this.title = title;
    }

    public void setViewersExcitement(int viewersExcitement) {
        this.viewersExcitement = viewersExcitement;
    }

    public void setViewingTime(int viewingTime) {
        this.viewingTime = viewingTime;
    }

    public void setEpisode(int episode) {
        if (episode >= 0) {
            this.episode = episode;
        }
        else {
            throw new EpisodeException("Episode amount can't be negative");
        }
    }

    /**
     * @return the title of the TV show.
     */
    public String getTitle () {

        return title;
    }

    /**
     * @return the accumulated viewers excitement by the TV show.
     */
    public int getViewersExcitement () {

        return viewersExcitement;
    }

    /**
     * @return the viewing time accumulated by the TV show.
     */
    public int getViewingTime () {
        return viewingTime;
    }

    /**
     * @return the episode count.
     */
    public int getEpisode () {
        return episode;
    }

    /**
     * Watch an episode of the TV show.
     *
     * Increases the watch time based on
     * the genre of the TV show,
     * increases the episode counter and
     * shows the intro.
     */
    public abstract void watch ();

    /**
     * Show the intro.
     *
     * Increases the viewers excitement
     * based on the genre of the TV Show.
     */
    public abstract void showIntro ();

    /**
     * Watch the next episode.
     */
    public abstract void watchNextEpisode ();

    /**
     * Show the season finale of the TV Show.
     *
     * Increases the viewers excitement based
     * on the genre of the TV Show.
     */
    public abstract void showSeasonFinale ();

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        return (obj instanceof TVShow) && (((TVShow) obj).getTitle().equals(this.title));
    }

}
