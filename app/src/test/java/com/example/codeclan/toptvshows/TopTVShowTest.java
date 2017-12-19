package com.example.codeclan.toptvshows;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fraserbrown on 19/12/2017.
 */

public class TopTVShowTest {

    @Test
    public void getListTest(){
        TopTVShows topTVShows = new TopTVShows();
        assertEquals(20, topTVShows.getList().size());
    }
}
