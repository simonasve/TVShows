package com.simonas_vedeckis.TVShow;

import java.util.Collection;

/**
 * A network for all kinds of unique TVShows. See {@link TVShow}
 */
public interface Network {

    /**
     * Add a newly created TV Show to the network.
     * It can be any kind of network.
     *
     * @param show show to add to the network
     */
    void addTVShow(TVShow show);

    /**
     * @return TV Shows currently on the network.
     */
    Collection<TVShow> getTVShows();

    /**
     * Count the revenue of the network,
     * based on the accumulated viewers excitement of all the TV Shows
     * and a made-up formula.
     * The amount is in millions of dollars.
     */
    void countRevenue ();

    /**
     * @return the total revenue of the network.
     */
    double getRevenue ();

    /**
     * @return true if the ratings of the network
     * have gone up since last year, based on the total
     * amount of revenue and watch time from all the TV Shows.
     * False in other cases.
     */
    boolean compareRatings ();
    
}
