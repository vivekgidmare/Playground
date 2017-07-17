package com.playground.chanel;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by vivek on 14/07/17.
 */

public abstract class ChanelRecyclerViewAdapter<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {
    public abstract T onCreateChanelViewHolder(ViewGroup parent,int viewType);
    public abstract void onBindChanelViewHolder(T holder, int position);
    public abstract int getChanelItemCount();
    public abstract void onChanelItemResize(T holder, int position,float offset);
    public abstract void onDefaultItemResize(T holder, int position,float offset);
    @Override
    public T onCreateViewHolder(ViewGroup parent, int viewType) {
        return onCreateChanelViewHolder(parent,viewType);
    }

    @Override
    public void onBindViewHolder(T holder, int position) {
        onBindChanelViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return getChanelItemCount();
    }
}
