package com.ms1.explorebangalore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView attractionsTextView = findViewById(R.id.main_attractions_btn);
        attractionsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchAttractionsActivity = new Intent(view.getContext(), AttractionsActivity.class);
                startActivity(launchAttractionsActivity);
            }
        });

        TextView transportTextView = findViewById(R.id.main_transport_btn);
        transportTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchTransportActivity = new Intent(view.getContext(), TransportActivity.class);
                startActivity(launchTransportActivity);
            }
        });

        TextView hangoutTextView = findViewById(R.id.main_shopping_btn);
        hangoutTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchHangoutsActivity = new Intent(view.getContext(), HangoutsActivity.class);
                startActivity(launchHangoutsActivity);
            }
        });

        TextView itHubsTextView = findViewById(R.id.main_it_hubs_btn);
        itHubsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchItHubsActivity = new Intent(view.getContext(), ItHubsActivity.class);
                startActivity(launchItHubsActivity);
            }
        });
    }
}
