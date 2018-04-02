package com.ms1.explorebangalore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.vidhana_soudha_name),getString(R.string.vidhana_soudha_desc),R.drawable.vs_list));
        locations.add(new Location(getString(R.string.lalbagh_name),getString(R.string.lalbagh_desc),R.drawable.lalbagh));
        locations.add(new Location(getString(R.string.cubbon_park_name),getString(R.string.cubbon_park_desc),R.drawable.cubbon_park));
        locations.add(new Location(getString(R.string.innovative_name),getString(R.string.innovative_desc),R.drawable.innovative_filmcity));
        locations.add(new Location(getString(R.string.bangalore_palace_name),getString(R.string.bangalore_palace_desc),R.drawable.bangalore_palace));
        locations.add(new Location(getString(R.string.wonderla_name),getString(R.string.wonderla_desc),R.drawable.wonderla));
        locations.add(new Location(getString(R.string.freedom_name),getString(R.string.freedom_desc),R.drawable.freedom_park));
        locations.add(new Location(getString(R.string.nandi_name),getString(R.string.nandi_desc),R.drawable.nandi_hills));
        locations.add(new Location(getString(R.string.highcourt_name),getString(R.string.highcourt_desc),R.drawable.high_court));
        locations.add(new Location(getString(R.string.iskcon_name),getString(R.string.iskcon_desc),R.drawable.isckon));

        LocationAdapter itemsAdapter = new LocationAdapter(this, locations);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
