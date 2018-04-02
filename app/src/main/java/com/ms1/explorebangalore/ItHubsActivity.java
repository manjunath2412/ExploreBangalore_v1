package com.ms1.explorebangalore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ItHubsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.itpl_name),getString(R.string.itpl_desc),R.drawable.itpl));
        locations.add(new Location(getString(R.string.manyata_name),getString(R.string.manyata_desc),R.drawable.manyata));
        locations.add(new Location(getString(R.string.bagmane_name),getString(R.string.bagmane_desc),R.drawable.bagmane));
        locations.add(new Location(getString(R.string.psn_name),getString(R.string.psn_desc),R.drawable.psn));
        locations.add(new Location(getString(R.string.ecity_name),getString(R.string.ecity_desc),R.drawable.electronic_city));
        locations.add(new Location(getString(R.string.ecospace_name),getString(R.string.ecospace_desc),R.drawable.ecospace));
        locations.add(new Location(getString(R.string.infinity_name),getString(R.string.infinity_desc),R.drawable.rmz_infinity));
        locations.add(new Location(getString(R.string.global_name),getString(R.string.global_desc),R.drawable.global));
        locations.add(new Location(getString(R.string.egl_name),getString(R.string.egl_desc),R.drawable.egl));
        locations.add(new Location(getString(R.string.cessna_name),getString(R.string.cessna_desc),R.drawable.cessna));

        LocationAdapter itemsAdapter = new LocationAdapter(this, locations);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
