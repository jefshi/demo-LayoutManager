package com.csp.layoutmanager.activity;

import android.support.v7.widget.RecyclerView;

import com.csp.layoutmanager.layout_manager.LayoutManager03;

public class Recycler03Activity extends RecyclerOneActivity {
    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return new LayoutManager03();
    }
}
