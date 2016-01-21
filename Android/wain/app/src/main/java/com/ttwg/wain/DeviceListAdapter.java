package com.ttwg.wain;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zj on 2016/1/4.
 */
public class DeviceListAdapter extends ArrayAdapter<DeviceListItem> {
    private  Context context;
    private boolean useList=true;
    public DeviceListAdapter(Context context,ArrayList<DeviceListItem> items)
    {
        super(context,android.R.layout.simple_list_item_1,items);
        this.context = context;

    }

    //. The "ViewHolder" pattern is used to customize the display of our individual list and grid items and enhance the list loading speed.
    public class ViewHolder{
        TextView titleText;
        TextView idText;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder =null;
        DeviceListItem item= getItem(position);
        View viewToUse = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            if(useList){
                viewToUse = mInflater.inflate(R.layout.device_list_item, null);
            } else {
                viewToUse = mInflater.inflate(R.layout.device_grid_item, null);
            }

            holder = new ViewHolder();
            holder.titleText = (TextView)viewToUse.findViewById(R.id.titleTextView);
            holder.idText = (TextView)viewToUse.findViewById(R.id.idTextView);
            viewToUse.setTag(holder);
        } else {
            viewToUse = convertView;
            holder = (ViewHolder) viewToUse.getTag();
        }

        holder.titleText.setText(item.getItemTitle());
        //int id = item.getid();
        holder.idText.setText(item.getid());
        return viewToUse;
    }
}
