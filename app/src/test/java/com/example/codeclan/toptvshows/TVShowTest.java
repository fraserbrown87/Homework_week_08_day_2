package com.example.codeclan.toptvshows;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fraserbrown on 19/12/2017.
 */

public class TVShowTest {

    TVShow tvshow;

    @Before
    public void before() {
        tvshow = new TVShow(101, "Family Guy", 2011);
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)101, tvshow.getRanking());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Family Guy", tvshow.getTitle());

    }

    @Test
    public void getYearTest() {
        assertEquals((Integer)2011, tvshow.getYear());

    }

}
