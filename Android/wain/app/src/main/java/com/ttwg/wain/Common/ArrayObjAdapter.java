package com.ttwg.wain.Common;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by zj on 2016/2/24.
 */



public abstract class ArrayObjAdapter<T> extends ArrayAdapter<T> {
    private Context context;
    private boolean useList=false;
    public ArrayObjAdapter(Context context,ArrayList<T> items)
    {
        super(context,android.R.layout.simple_list_item_1,items);
        this.context = context;

    }


    protected abstract int GetLayoutId();


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ArrayObjViewHolder<T> holder =null;
        T item= getItem(position);
        View viewToUse = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            viewToUse = mInflater.inflate(GetLayoutId(), null);
            holder =  CreateViewHolder();
            holder.InitControl(viewToUse);
            viewToUse.setTag(holder);
        } else {
            viewToUse = convertView;
            holder = (ArrayObjViewHolder<T> ) viewToUse.getTag();
        }

        holder.BindDataToControl(item);
        return viewToUse;
    }

    protected abstract ArrayObjViewHolder<T> CreateViewHolder();

}