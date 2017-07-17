package com.playground.chanel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.playground.R;
import com.playground.customview.ChanelRecyclerView;

import java.util.ArrayList;

public class ChanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chanel);

        ChanelRecyclerView recyclerView = (ChanelRecyclerView) findViewById(R.id.chanel_recycler_view);
        ChanelLayoutManager linearLayoutManager = new ChanelLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add("Item " + i);
        }

        ChanelRecyclerAdapter chanelRecyclerAdapter = new ChanelRecyclerAdapter(this, arrayList);
        recyclerView.setAdapter(chanelRecyclerAdapter);


    }
}
