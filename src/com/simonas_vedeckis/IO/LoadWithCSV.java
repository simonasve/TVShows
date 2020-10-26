package com.simonas_vedeckis.IO;

import com.simonas_vedeckis.TVShow.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadWithCSV {

    public static void loadWithCSV () throws IOException{
        System.out.println();
        System.out.println("CSV:");

        TVShowNetwork hbo = new TVShowNetwork();

        TVShow show1 = TVShowFactory.createFantasyShow("Game Of Thrones");
        TVShow show2 = TVShowFactory.createSitcomShow("Friends");
        TVShow show3 = TVShowFactory.createDramaShow("The Sopranos");

        hbo.addTVShow(show1);
        hbo.addTVShow(show2);
        hbo.addTVShow(show3);

        boolean skipLine = false;
        String CSVFile = "C:/Users/Asus/IdeaProjects/TVShows/HBO.csv";
        FileWriter writer = new FileWriter(CSVFile);
        String line;
        String cvsSplitBy = ",";

        CSV.writeHeader(writer, Arrays.asList("Title", "Episodes", "Viewers Excitement", "Viewing Time"));

        for (TVShow show: hbo.getTVShows()){
            List<String> list = new ArrayList<>();
            list.add(show.getTitle());
            list.add(String.valueOf(show.getEpisode()));
            list.add(String.valueOf(show.getViewersExcitement()));
            list.add(String.valueOf(show.getViewingTime()));

            CSV.writeLine(writer,list);
        }
        writer.flush();
        writer.close();

        System.out.println("Before Load:");
        for (int i = 0; i < 5; i++) {
            show1.watch();
            show2.watch();
            show3.watch();
        }

        for (TVShow show: hbo.getTVShows()) {
            System.out.println(show.getTitle() + " Episodes Watched:" + show.getEpisode() + " Viewers Excitement:" + show.getViewersExcitement() + " Viewing Time:" + show.getViewingTime());
        }

        System.out.println();
        System.out.println("After Load:");

        try (BufferedReader br = new BufferedReader(new FileReader(CSVFile))) {
            while ((line = br.readLine()) != null) {
                if (skipLine) {
                    String[] show = line.split(cvsSplitBy);
                    System.out.println(show[0] + " Episodes Watched:" + show[1] + " Viewers Excitement:" + show[2] + " Viewing Time:" + show[3]);
                }
                skipLine = true;
            }
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }
}
