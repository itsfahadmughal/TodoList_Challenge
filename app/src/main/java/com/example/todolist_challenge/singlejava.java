package com.example.todolist_challenge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class singlejava extends BaseAdapter {
    List<String> text=new ArrayList<String>();
    Context context;

    singlejava(Context c, List<String> ls){
        context=c;
        text=ls;
    }
    @Override
    public int getCount() {
        return text.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.single,parent,false);
        TextView tv=convertView.findViewById(R.id.textView);
        tv.setText(text.get(position));
        return convertView;
    }
}
