package com.ms1.explorebangalore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TransportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.kial_name),getString(R.string.kial_desc),R.drawable.kial));
        locations.add(new Location(getString(R.string.bmtc_name),getString(R.string.bmtc_desc),R.drawable.bmtc));
        locations.add(new Location(getString(R.string.bmrcl_name),getString(R.string.bmrcl_desc),R.drawable.bmrcl));
        locations.add(new Location(getString(R.string.ksrtc_name),getString(R.string.ksrtc_desc),R.drawable.ksrtc));
        locations.add(new Location(getString(R.string.rail_name),getString(R.string.rail_desc),R.drawable.rail));
        locations.add(new Location(getString(R.string.ola_name),getString(R.string.ola_desc),R.drawable.ola));
        locations.add(new Location(getString(R.string.uber_name),getString(R.string.uber_desc),R.drawable.uber));
        locations.add(new Location(getString(R.string.kstdc_name),getString(R.string.kstdc_desc),R.drawable.kstdc));

        LocationAdapter itemsAdapter = new LocationAdapter(this, locations);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
