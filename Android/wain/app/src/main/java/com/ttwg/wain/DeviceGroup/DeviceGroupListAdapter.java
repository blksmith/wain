package com.ttwg.wain.DeviceGroup;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.ttwg.wain.Common.ArrayObjAdapter;
import com.ttwg.wain.Common.ArrayObjViewHolder;
import com.ttwg.wain.R;

import java.util.ArrayList;

/**
 * Created by zj on 2016/1/4.
 */
public class DeviceGroupListAdapter extends ArrayObjAdapter<DeviceGroupItem> {

    private boolean useList=false;
    public DeviceGroupListAdapter(Context context,ArrayList<DeviceGroupItem> items)
    {
        super(context,items);


    }

    @Override
    protected ArrayObjViewHolder<DeviceGroupItem> CreateViewHolder() {
        return new DeviceGroupViewHolder();
    }



    @Override
    protected int GetLayoutId() {
        return R.layout.device_grid_item;
    }

    private class DeviceGroupViewHolder extends ArrayObjViewHolder<DeviceGroupItem>
    {
        private TextView titleText;
        private TextView idText;
        @Override
        public void InitControl(View view) {
            idText= (TextView)view.findViewById(R.id.idTextView);
            titleText= (TextView)view.findViewById(R.id.titleTextView);
        }

        @Override
        public void BindDataToControl(DeviceGroupItem item) {
           titleText.setText(item.getItemTitle());
           idText.setText(String.valueOf(item.getid()));

        }
    }

}



