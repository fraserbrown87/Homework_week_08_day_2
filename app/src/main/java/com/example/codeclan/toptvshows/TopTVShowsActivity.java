package com.example.codeclan.toptvshows;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopTVShowsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tvshows_list);

        TopTVShows topTVShows = new TopTVShows();
        ArrayList<TVShow> list = topTVShows.getList();

        TopTVShowsAdapter tvShowAdapter = new TopTVShowsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list); //UPDATED
        listView.setAdapter(tvShowAdapter);
    }

    public void getTVShow(View listItem) {
        TVShow tvshow = (TVShow) listItem.getTag();
        Log.d("Movie Title: ", tvshow.getTitle());

        Intent intent = new Intent(this, TVShowActivity.class); //NEW
        intent.putExtra("tvshow", tvshow); //NEW
        startActivity(intent);
    }
}
