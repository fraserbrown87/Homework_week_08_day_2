package com.example.codeclan.toptvshows;

import java.io.Serializable;

/**
 * Created by fraserbrown on 19/12/2017.
 */

public class TVShow implements Serializable {

    private Integer ranking;
    private String title;
    private Integer year;

    public TVShow(Integer ranking, String title, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
