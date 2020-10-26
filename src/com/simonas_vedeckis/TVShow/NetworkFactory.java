package com.simonas_vedeckis.TVShow;

/**
 * Factory for {@link Network} instances. This is the application entry point.
 */

public class NetworkFactory {


    /**
     * Creates new instances of a Network.
     *
     * @return instance of a TV show network.
     */
    public static Network createTVShowNetwork() {
        return new TVShowNetwork();
    }
}
