package com.playground.instant;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.instantapps.InstantApps;
import com.playground.R;
import com.playground.chanel.ChanelLayoutManager;
import com.playground.chanel.ChanelRecyclerAdapter;
import com.playground.customview.ChanelRecyclerView;

import java.util.ArrayList;

public class MoviesListActivity extends AppCompatActivity implements View.OnClickListener {

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

        findViewById(R.id.btn_one).setOnClickListener(this);
        findViewById(R.id.btn_two).setOnClickListener(this);

        Button btn_install_full= (Button) findViewById(R.id.btn_install_full);
        if (InstantApps.isInstantApp(this)){
            btn_install_full.setVisibility(View.VISIBLE);
            btn_install_full.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                    InstantApps.showInstallPrompt(MoviesListActivity.this,0,"Install App");
                    }catch (ActivityNotFoundException e){
                        e.printStackTrace();
                    }
                }
            });
        }else{
            btn_install_full.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.btn_one) {
            Log.d("TAG", "onClick:#1 ");

        } else if (i == R.id.btn_two) {
            Log.d("TAG", "onClick:#2 ");

        }
    }
}
