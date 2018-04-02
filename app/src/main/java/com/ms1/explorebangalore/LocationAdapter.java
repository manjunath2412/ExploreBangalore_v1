package com.ms1.explorebangalore;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ms1 on 25-03-2018.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations)
    {
        super(context,0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Location currentWord = getItem(position);

        TextView getAttractionName = listItemView.findViewById(R.id.list_attraction_name);
        getAttractionName.setText(currentWord.getmAttractionName());

        TextView getAttractionDesc = listItemView.findViewById(R.id.list_attraction_description);
        getAttractionDesc.setText(currentWord.getmAttractionDescription());

        ImageView getAttractionImage = listItemView.findViewById(R.id.list_img_view);
        getAttractionImage.setImageResource(currentWord.getmImageResource());

        return listItemView;


    }
}
