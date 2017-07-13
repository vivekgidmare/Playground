package com.playground.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import com.playground.R;
import com.playground.chanel.ChanelRecyclerViewAdapter;

/**
 * Created by vivek on 13/07/17.
 */

public class ChanelRecyclerView extends RecyclerView {
    private int defaultItemHeight, chanelItemHeight;
    private int totalItemsInRecyclerView;
    private int maxDistance;
    private int heightDifference;
    private int itemToResize;

    private ChanelRecyclerViewAdapter recyclerViewAdapter;

    public ChanelRecyclerView(Context context) {
        super(context);
        init(context, null);

    }

    public ChanelRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }


    private void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.ChanelRecyclerView);

        initAttr(typedArray);
        typedArray.recycle();


        addOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);


            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (getLayoutManager() instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
                    if (linearLayoutManager.getOrientation() == LinearLayoutManager.VERTICAL) {
                        totalItemsInRecyclerView = linearLayoutManager.getItemCount();

                        itemToResize = dy > 0 ? 1 : 0;
                        changeHeightOfItem(recyclerView);
                    }
                }
            }
        });


    }


    private void changeHeightOfItem(RecyclerView recyclerView) {

        for (int i = 0; i < totalItemsInRecyclerView; i++) {
            View view = recyclerView.getChildAt(i);
            if (view != null) {
                float distanceFromTop = getTopOfView(view);
                if (distanceFromTop > maxDistance) {
                    //Kep Original Height
                    view.getLayoutParams().height = defaultItemHeight;
                    view.requestLayout();
                } else if (distanceFromTop <= maxDistance) {
                    //Change Height
                    view.getLayoutParams().height = (int) calculateChanelItemHeight(distanceFromTop);
                    view.requestLayout();
                }

                if (i == itemToResize) {
                    onChanelItemResize(view, recyclerView);
                } else {
                    onDefaultItemResize(view, recyclerView);
                }

            }

        }


    }


    private float calculateOffset(int viewHeight) {
        return ((viewHeight - defaultItemHeight) * 100) / heightDifference;
    }

    private void onChanelItemResize(View view, RecyclerView recyclerView) {
        if (recyclerViewAdapter != null) {
            recyclerViewAdapter.onChanelItemResize(recyclerView.getChildViewHolder(view), itemToResize, calculateOffset(view.getHeight()));
        }
    }

    private void onDefaultItemResize(View view, RecyclerView recyclerView) {
        if (recyclerViewAdapter != null) {
            recyclerViewAdapter.onDefaultItemResize(recyclerView.getChildViewHolder(view), itemToResize, calculateOffset(view.getHeight()));
        }
    }

    private float calculateChanelItemHeight(float distanceFromTop) {

        return chanelItemHeight - ((distanceFromTop * (heightDifference)) / maxDistance);
    }

    private float getTopOfView(View view) {
        return Math.abs(view.getTop());
    }

    private void initAttr(TypedArray typedArray) {
        defaultItemHeight = (int) typedArray.getDimension(R.styleable.ChanelRecyclerView_defaultItemHeight, R.attr.defaultItemHeight);
        chanelItemHeight = (int) typedArray.getDimension(R.styleable.ChanelRecyclerView_chanelItemHeight, R.attr.chanelItemHeight);

        heightDifference = chanelItemHeight - defaultItemHeight;
        maxDistance = chanelItemHeight;
    }


    @Override
    public void setAdapter(Adapter adapter) {

        if (adapter instanceof ChanelRecyclerViewAdapter) {
            this.recyclerViewAdapter = (ChanelRecyclerViewAdapter) adapter;
        }
        super.setAdapter(adapter);
    }
}
