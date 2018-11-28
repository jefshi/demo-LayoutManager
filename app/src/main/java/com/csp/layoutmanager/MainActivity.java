package com.csp.layoutmanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.csp.layoutmanager.activity.Recycler03Activity;
import com.csp.layoutmanager.activity.RecyclerOneActivity;
import com.csp.layoutmanager.activity.RecyclerTwoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // onLayoutChildren()
        findViewById(R.id.btn_ST01).setOnClickListener(v -> startActivity(RecyclerOneActivity.class));

        // 添加滑动
        findViewById(R.id.btn_ST02).setOnClickListener(v -> startActivity(RecyclerTwoActivity.class));

        // ???
        findViewById(R.id.btn_ST03).setOnClickListener(v -> startActivity(Recycler03Activity.class));
    }

    private void startActivity(Class<? extends Activity> cls) {
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
