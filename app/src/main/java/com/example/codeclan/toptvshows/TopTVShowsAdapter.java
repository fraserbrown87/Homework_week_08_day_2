package com.example.codeclan.toptvshows;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fraserbrown on 19/12/2017.
 */

public class TopTVShowsAdapter extends ArrayAdapter<TVShow>{

    public TopTVShowsAdapter(Context context, ArrayList<TVShow> tvshow) {
        super(context, 0, tvshow);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.tvshows_item, parent, false);
        }

        TVShow currentTVShow = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentTVShow.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentTVShow.getTitle());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentTVShow.getYear().toString());

        listItemView.setTag(currentTVShow);

        return listItemView;

    }


}
