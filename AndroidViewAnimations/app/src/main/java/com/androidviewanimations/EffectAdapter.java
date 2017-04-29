package com.androidviewanimations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.androidviewanimations.library.Techniques;

public class EffectAdapter extends BaseAdapter {

    private Context mContext;

    public EffectAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return Techniques.values().length;
    }

    @Override
    public Object getItem(int position) {
        return Techniques.values()[position].getAnimator();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item, null, false);

        TextView t = (TextView) convertView.findViewById(R.id.list_item_text);
        Object obj = getItem(position);
        int start = obj.getClass().getName().lastIndexOf(".") + 1;
        String name = obj.getClass().getName().substring(start);
        t.setText(name);
        convertView.setTag(Techniques.values()[position]);
        return convertView;
    }
}
