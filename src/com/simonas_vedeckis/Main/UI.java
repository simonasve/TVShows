package com.simonas_vedeckis.Main;

import com.simonas_vedeckis.TVShow.TVShow;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UI {

//   static TVShowRevenueService object;
//
//    public UI (TVShowRevenueService obj) {
//
//        object = obj;
//    }
//
//    int quit = 0;
//    Scanner scan = new Scanner(System.in);
//    TVShow GoT = new FantasyShow("Game Of Thrones", "Fantasy", "HBO", 1551);
//    FantasyShow GoT1 = new FantasyShow("Game Of Thrones", "Fantasy", "HBO", 1551);
//    FantasyShow ST = new FantasyShow("Stranger Things", "Fantasy", "Netflix", 1221);
//    TVShow BrBa = new DramaShow("Breaking Bad", "Drama", "amc", 1001);
//    TVShow ModernFamily = new SitcomShow("Moder Family", "Sitcom", "abc", 1441);
//
//
//    public void runUI () {
//        while (quit != 1) {
//            System.out.println("What do you want to watch?");
//            System.out.println("1. A Fantasy Show");
//            System.out.println("2. A Drama Show");
//            System.out.println("3. A Sitcom Show");
//            System.out.println("4. Nothing");
//            System.out.println("5. equals() test");
//            int choice = scan.nextInt();
//            scan.nextLine();
//            TVShow show;
//            switch (choice) {
//                case 1:
//                    System.out.println("Fantasy shows: ");
//                    System.out.println("1. " + GoT.title);
//                    int choice1 = scan.nextInt();
//                    scan.nextLine();
//                    if (choice1 == 1) {
//                        show = GoT;
//                        showTVShow(show);
//                    }
//                    else {
//                        System.out.println("Choose again...");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Drama shows: ");
//                    System.out.println("1. " + BrBa.title);
//                    int choice2 = scan.nextInt();
//                    scan.nextLine();
//                    if (choice2 == 1) {
//                        show = BrBa;
//                        showTVShow(show);
//                    }
//                    else {
//                        System.out.println("Choose again...");
//                    }
//                    break;
//                case 3:
//                    System.out.println("Sitcom shows: ");
//                    System.out.println("1. " + ModernFamily.title);
//                    int choice3 = scan.nextInt();
//                    scan.nextLine();
//                    if (choice3 == 1) {
//                        show = ModernFamily;
//                        showTVShow(show);
//                    }
//                    else {
//                        System.out.println("Choose again...");
//                    }
//                    break;
//                case 4:
//                    quit = 1;
//                    break;
//                case 5:
//                    System.out.println(GoT.equals(GoT1));
//                    System.out.println(GoT.equals(ST));
//                    quit = 1;
//                    break;
//                default:
//                    System.out.println("Choose again...");
//            }
//        }
//    }
//
//    public static void showTVShow(TVShow show) {
//     Scanner scan1 = new Scanner(System.in);
//     show.watch();
//     System.out.println("The episode has ended");
//     int quit1 = 0;
//     while (quit1 != 1) {
//         System.out.println("Keep watching?");
//         System.out.println("1. Yes");
//         System.out.println("2. No");
//         int choose1 = scan1.nextInt();
//         scan1.nextLine();
//           if (choose1 == 1) {
//               show.watchNextEpisode();
//               System.out.println("The episode has ended");
//               if (show.episode ==10) {
//                   endOfSeason(show);
//                   quit1 = 1;
//               }
//           }
//           else if (choose1 == 2) {
//               endOfSeason(show);
//               quit1 = 1;
//           }
//           else {
//               System.out.println("Choose again...");
//           }
//        }
//    }
//
//    public static void endOfSeason (TVShow show) {
//        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.println("You watched the whole season!");
//        show.showSeasonFinale();
//        object.countRevenue(show);
//        System.out.println("The network " + (show.network + " has a revenue of " + df.format(object.getRevenue()) + " million euros."));
//        if (object.compareRatings(show.viewingTime)) {
//            System.out.println("The ratings have gone up compared to last year!");
//        }
//        else {
//            System.out.println("The ratings have't gone up since last year...");
//        }
//    }

}
