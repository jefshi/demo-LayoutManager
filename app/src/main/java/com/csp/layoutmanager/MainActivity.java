package com.csp.layoutmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.csp.layoutmanager.activity.RecyclerOneActivity;
import com.csp.layoutmanager.activity.RecyclerTwoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onLayoutChildren()
        findViewById(R.id.btn_one).setOnClickListener(v -> startActivity(RecyclerOneActivity.class));

        // 添加滑动
        findViewById(R.id.btn_two).setOnClickListener(v -> startActivity(RecyclerTwoActivity.class));


    }

    private void startActivity(Class<? extends Activity> cls) {
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
