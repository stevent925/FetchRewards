package com.example.fetchrewards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Customer adapter to handle the TextViews within the ListView
 */
public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<ColumnsModel> arrayList;

    public MyAdapter(Context context, ArrayList<ColumnsModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public  View getView(final int position, View view, ViewGroup parent) {
        if (view ==  null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        }
        TextView id, name, listId;
        id = (TextView) view.findViewById(R.id.id);
        name = (TextView) view.findViewById(R.id.name);
        listId = (TextView) view.findViewById(R.id.listId);


        id.setText(arrayList.get(position).getId());
        name.setText(arrayList.get(position).getName());
        listId.setText(arrayList.get(position).getListId());

        return view;
    }
}