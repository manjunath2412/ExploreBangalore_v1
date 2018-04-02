package com.ms1.explorebangalore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HangoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.ub_city_name),getString(R.string.ub_city_desc),R.drawable.ub_city));
        locations.add(new Location(getString(R.string.orian_name),getString(R.string.orian_desc),R.drawable.orion_mall));
        locations.add(new Location(getString(R.string.mantri_name),getString(R.string.mantri_desc),R.drawable.mantri_square));
        locations.add(new Location(getString(R.string.forum_name),getString(R.string.forum_desc),R.drawable.forum_mall));
        locations.add(new Location(getString(R.string.phoenix_name),getString(R.string.phoenix_desc),R.drawable.phoenix_mall));
        locations.add(new Location(getString(R.string.ascendas_name),getString(R.string.ascendas_desc),R.drawable.ascendas_mall));
        locations.add(new Location(getString(R.string.garuda_name),getString(R.string.garuda_desc),R.drawable.garuda_mall));
        locations.add(new Location(getString(R.string.inorbit_name),getString(R.string.inorbit_desc),R.drawable.inorbit_mall));
        locations.add(new Location(getString(R.string.meenakshi_name),getString(R.string.meenakshi_desc),R.drawable.meenakshi_mall));
        locations.add(new Location(getString(R.string.vega_city_name),getString(R.string.vega_city_desc),R.drawable.vega_city));

        LocationAdapter itemsAdapter = new LocationAdapter(this, locations);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
