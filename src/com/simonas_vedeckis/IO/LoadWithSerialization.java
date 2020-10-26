package com.simonas_vedeckis.IO;

import com.simonas_vedeckis.TVShow.*;

import java.io.*;

public class LoadWithSerialization {

    public static void loadWithSerialization () {
        TVShowNetwork hbo = new TVShowNetwork();

        TVShow show1 = TVShowFactory.createFantasyShow("Game Of Thrones");
        TVShow show2 = TVShowFactory.createSitcomShow("Modern Family");
        TVShow show3 = TVShowFactory.createDramaShow("The Sopranos");

        hbo.addTVShow(show1);
        hbo.addTVShow(show2);
        hbo.addTVShow(show3);

        try {
            show1.setEpisode(-1);
        } catch (EpisodeException e) {
            System.out.println("Episode amount not set. " + e.getMessage());
        }

        System.out.println();

        try(FileOutputStream file = new FileOutputStream("HBO"); ObjectOutputStream oos = new ObjectOutputStream(file)) {
            oos.writeObject(hbo);
        }
        catch (IOException e)
        {
            System.out.println("IO exception");
        }

        System.out.println("Before load:");
        for (int i = 0; i < 6; i++) {
            show1.watch();
            show2.watch();
            show3.watch();
        }

        for (TVShow show: hbo.getTVShows()) {
            System.out.println(show.getTitle() + " Episodes Watched:" + show.getEpisode() + " Viewers Excitement:" + show.getViewersExcitement() + " Viewing Time:" + show.getViewingTime());
        }

        try (FileInputStream file = new FileInputStream("HBO"); ObjectInputStream ois = new ObjectInputStream(file)){
            hbo = (TVShowNetwork)ois.readObject();
        } catch(IOException e){
            System.out.println("IO exception");
        } catch(ClassNotFoundException e){
            System.out.println("Network class not found");
        }

        System.out.println();
        System.out.println("After Load:");
        for (TVShow show: hbo.getTVShows()) {
            System.out.println(show.getTitle() + " Episodes Watched:" + show.getEpisode() + " Viewers Excitement:" + show.getViewersExcitement() + " Viewing Time:" + show.getViewingTime());
        }
    }
}
