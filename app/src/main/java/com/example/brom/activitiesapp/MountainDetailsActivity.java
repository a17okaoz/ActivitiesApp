package com.example.brom.activitiesapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();

        String name = extras.getString("EXTRA_NAME");
        String location = extras.getString("EXTRA_LOCATION");
        String height = extras.getString("EXTRA_HEIGHT");

        TextView nameTextView = (TextView) findViewById(R.id.textView);
        TextView locationTextView = (TextView) findViewById(R.id.textView2);
        TextView heightTextView = (TextView) findViewById(R.id.textView3);

        nameTextView.setText(name);
        locationTextView.setText(location);
        heightTextView.setText(height);
    }

}
