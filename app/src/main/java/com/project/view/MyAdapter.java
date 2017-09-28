package com.project.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by acer on 9/28/2017.
 */

public class MyAdapter extends ArrayAdapter<String> {
    String[] name;
    String[] phonenumber;
    Context mcontext;
    private TextView mname;
    ViewHolder mViewHolder;
    private TextView mphonenumber;


    public MyAdapter(Context context, String[] name, String[] phonenumber) {
        super(context, R.layout.listview_item);
        this.name = name;
        this.phonenumber = phonenumber;
        this.mcontext = context;
    }

    public int getCount() {
        return name.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            mViewHolder.mname = (TextView) convertView.findViewById(R.id.textView);
            mViewHolder.mphonenumber = (TextView) convertView.findViewById(R.id.textView2);
            mname.setText(name[position]);
            mphonenumber.setText(phonenumber[position]);
            convertView.setTag(mViewHolder);

        }
            return convertView;
        }
       static class ViewHolder{
           TextView mname;
           TextView mphonenumber;
       }
    }





