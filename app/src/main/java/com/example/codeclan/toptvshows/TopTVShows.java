package com.example.codeclan.toptvshows;

import java.util.ArrayList;

/**
 * Created by fraserbrown on 19/12/2017.
 */

public class TopTVShows {

    private ArrayList<TVShow> list;

    public TopTVShows() {
        list = new ArrayList<TVShow>();
        list.add(new TVShow(1, "The Wire", 2002));
        list.add(new TVShow(2, "Breaking Bad", 2008));
        list.add(new TVShow(3, "The Sopranos", 1999));
        list.add(new TVShow(4, "The Simpsons", 1989));
        list.add(new TVShow(5, "Silicon Valley", 1994));
        list.add(new TVShow(6, "MINDHUNTER", 2003));
        list.add(new TVShow(7, "Game of Thrones", 2011));
        list.add(new TVShow(8, "Oz", 1997));
        list.add(new TVShow(9, "Blackadder", 1983));
        list.add(new TVShow(10, "The Killing", 2007));
        list.add(new TVShow(11, "Rick and Morty", 1993));
        list.add(new TVShow(12, "The Twighlight Zone", 1959));
        list.add(new TVShow(13, "Deadwood", 2004));
        list.add(new TVShow(14, "Mad Men", 2007));
        list.add(new TVShow(15, "The X-Files", 1993));
        list.add(new TVShow(16, "Seinfeld", 1990));
        list.add(new TVShow(17, "Lost", 2004));
        list.add(new TVShow(18, "The Office", 2001));
        list.add(new TVShow(19, "Curb Your Enthusiasm", 2000));
        list.add(new TVShow(20, "I’m Alan Partridge", 1997));
    }

    public ArrayList<TVShow> getList() {
        return new ArrayList<TVShow>(list);
    }
}
