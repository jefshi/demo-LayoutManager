package com.csp.layoutmanager.activity;

import android.support.v7.widget.RecyclerView;

import com.csp.layoutmanager.layout_manager.TwoLayoutManager;

public class RecyclerTwoActivity extends RecyclerOneActivity {
    @Override
    protected RecyclerView.LayoutManager getLayoutManager() {
        return new TwoLayoutManager();
    }
}
