package com.csp.layoutmanager.activity;

import android.support.v7.widget.RecyclerView;

import com.csp.layoutmanager.layout_manager.LayoutManager04;

public class Recycler04Activity extends RecyclerOneActivity {
    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return new LayoutManager04();
    }
}
