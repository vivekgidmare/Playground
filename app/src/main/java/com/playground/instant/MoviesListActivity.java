package com.playground.instant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.playground.R;
import com.playground.chanel.ChanelLayoutManager;
import com.playground.chanel.ChanelRecyclerAdapter;
import com.playground.customview.ChanelRecyclerView;

import java.util.ArrayList;

public class MoviesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_list);


        ChanelRecyclerView recyclerView = (ChanelRecyclerView) findViewById(R.id.chanel_recycler_view);
        ChanelLayoutManager linearLayoutManager = new ChanelLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add("Item " + i);
        }

        ChanelRecyclerAdapter chanelRecyclerAdapter = new ChanelRecyclerAdapter(this, arrayList);
        recyclerView.setAdapter(chanelRecyclerAdapter);
        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
        Log.d("TAG", "MoviesListActivity:onCreate: "+appLinkAction+":"+appLinkData);
    }
}
