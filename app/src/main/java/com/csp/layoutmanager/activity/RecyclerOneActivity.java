package com.csp.layoutmanager.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.csp.layoutmanager.R;
import com.csp.layoutmanager.adapter.TagAdapter;
import com.csp.layoutmanager.layout_manager.OneLayoutManager;

public class RecyclerOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recycler = findViewById(R.id.rcv_content);

        // 单布局
        TagAdapter tagAdapter = new TagAdapter(this);
        recycler.setLayoutManager(getLayoutManager());
        recycler.setAdapter(tagAdapter);

        // 添加数据
        TagAdapter.addData(tagAdapter);
    }

    protected RecyclerView.LayoutManager getLayoutManager() {
        return new OneLayoutManager();
    }
}
