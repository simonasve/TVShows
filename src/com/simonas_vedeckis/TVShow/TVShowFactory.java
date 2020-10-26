package com.simonas_vedeckis.TVShow;

/**
 * Factory for {@link TVShow} instances. This is the application entry point.
 */

public class TVShowFactory {

    /**
     * Creates new instance of a FantasyShow.
     *
     * @param title title of the TVShow.
     * @return instance of FantasyShow.
     */
    public static TVShow createFantasyShow(String title) {
        return new FantasyShow(title);
    }

    /**
     * Creates new instance of a DramaShow.
     *
     * @param title title of the TVShow.
     * @return instance of DramaShow.
     */
    public static TVShow createDramaShow(String title) {
        return new DramaShow(title);
    }

    /**
     * Creates new instance of a SitcomShow.
     *
     * @param title title of the TVShow.
     * @return instance of SitcomShow.
     */
    public static TVShow createSitcomShow(String title) {
        return new SitcomShow(title);
    }

}
