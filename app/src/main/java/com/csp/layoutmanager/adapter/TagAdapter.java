package com.csp.layoutmanager.adapter;

import android.content.Context;

import com.csp.adapter.recyclerview.SingleAdapter;
import com.csp.adapter.recyclerview.ViewHolder;
import com.csp.layoutmanager.util.LogCat;
import com.csp.layoutmanager.R;

import java.util.ArrayList;
import java.util.List;


public class TagAdapter extends SingleAdapter<String> {

    public TagAdapter(Context context) {
        super(context, R.layout.item_tag);
    }

    @Override
    protected void onCreateViewHolder(ViewHolder holder) {
        super.onCreateViewHolder(holder);

        LogCat.w(holder);
    }

    @Override
    protected void onBind(ViewHolder holder, String datum, final int position) {
        holder.setText(R.id.txt_tag, datum);

        holder.getConvertView().setOnClickListener(v -> {
            mData.remove(datum);
            notifyDataSetChanged();

            if (mOnItemClickListener != null)
                mOnItemClickListener.onItemClick(null, null, holder, position, -1);
        });
    }

    public static void addData(TagAdapter adapter) {
        List<String> list = new ArrayList<>();
        list.add("角色扮演");
        list.add("动作");
        list.add("换装");
        list.add("动漫");
        list.add("放置");
        list.add("经营");
        list.add("竞速");
        list.add("卡片");
        list.add("恋爱");
        list.add("美少女");
        list.add("女性向");
        list.add("消除");
        list.add("音乐节奏");
        list.add("育成");
        list.add("育成");
        adapter.addData(list, false);
        adapter.notifyDataSetChanged();
    }
}
