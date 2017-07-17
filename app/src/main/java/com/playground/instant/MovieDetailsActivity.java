package com.playground.instant;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.playground.R;

public class MovieDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        if (appLinkIntent.hasExtra("position")) {
            int position = appLinkIntent.getIntExtra("position", 0);
            Log.d("TAG", "Position :" + position);
        }
        if (appLinkIntent.hasExtra("color_tag")) {
            String color_tag = appLinkIntent.getStringExtra("color_tag");
            Log.d("TAG", "color_tag :" + color_tag);

            findViewById(R.id.main_layout).setBackgroundColor(Color.parseColor(color_tag));
        }
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
        Log.d("TAG", "MovieDetailsActivity:onCreate: " + appLinkAction + ":" + appLinkData);
    }


}
