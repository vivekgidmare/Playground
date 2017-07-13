package com.playground.chanel;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.playground.R;

import java.util.ArrayList;

/**
 * Created by vivek on 14/07/17.
 */

public class ChanelRecyclerAdapter extends ChanelRecyclerViewAdapter<ChanelRecyclerAdapter.ChanelHolder> {
    private ArrayList<String> data = new ArrayList<>();
    private Context mContext;
    String[] colorArray;

    public ChanelRecyclerAdapter(Context context, ArrayList<String> data) {
        this.mContext = context;
        this.data = data;
        colorArray = mContext.getResources().getStringArray(R.array.color_array);
    }

    @Override
    public ChanelHolder onCreateChanelViewHolder(ViewGroup parent, int viewType) {
        return new ChanelHolder(LayoutInflater.from(mContext).inflate(R.layout.chanel_recycler_item, parent, false));
    }

    @Override
    public void onBindChanelViewHolder(ChanelHolder holder, int position) {
        ChanelHolder chanelHolder = (ChanelHolder) holder;
        chanelHolder.layout.setBackgroundColor(Color.parseColor(colorArray[position%colorArray.length]));
        chanelHolder.tv_title.setText("Item " + position);
    }

    @Override
    public int getChanelItemCount() {
        return data.size();
    }

    @Override
    public void onChanelItemResize(ChanelHolder holder, int position, float offset) {
        holder.tv_title.setAlpha(offset/100f);
    }

    @Override
    public void onDefaultItemResize(ChanelHolder holder, int position, float offset) {
        holder.tv_title.setAlpha(offset/100f);
    }



    public static class ChanelHolder extends RecyclerView.ViewHolder {
        private FrameLayout layout;
        private TextView tv_title;

        public ChanelHolder(View itemView) {
            super(itemView);
            layout = (FrameLayout) itemView.findViewById(R.id.parent_layout);
            tv_title = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
