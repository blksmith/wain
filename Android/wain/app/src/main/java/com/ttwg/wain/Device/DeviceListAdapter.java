package com.ttwg.wain.Device;

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
public class DeviceListAdapter extends ArrayObjAdapter<DeviceItem> {

    private boolean useList=false;
    public DeviceListAdapter(Context context,ArrayList<DeviceItem> items)
    {
        super(context,items);


    }

    @Override
    protected ArrayObjViewHolder<DeviceItem> CreateViewHolder() {
        return new DeviceViewHolder();
    }



    @Override
    protected int GetLayoutId() {
        return R.layout.device_grid_item;
    }

    private class DeviceViewHolder extends ArrayObjViewHolder<DeviceItem>
    {
        private TextView titleText;
        private TextView idText;
        @Override
        public void InitControl(View view) {
            idText= (TextView)view.findViewById(R.id.idTextView);
          //  titleText= (TextView)view.findViewById(R.id.titleTextView);
        }

        @Override
        public void BindDataToControl(DeviceItem item) {
        //    titleText.setText(item.getItemTitle());
        //  idText.setText(String.valueOf(item.getid()));

        }
    }

}



