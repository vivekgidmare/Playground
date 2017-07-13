package com.playground.chanel;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by vivek on 14/07/17.
 */

public class ChanelLayoutManager extends LinearLayoutManager {
    public ChanelLayoutManager(Context context) {
        super(context);
    }

    public ChanelLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    @Override
    protected int getExtraLayoutSpace(RecyclerView.State state) {
        return 1000;
//        return super.getExtraLayoutSpace(state);
    }
}
