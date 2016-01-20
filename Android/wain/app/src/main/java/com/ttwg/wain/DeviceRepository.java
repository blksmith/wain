package com.ttwg.wain;

import android.bluetooth.BluetoothClass;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by zj on 2016/1/19.
 */
public class DeviceRepository {
    private ArrayList<DeviceListItem> mDevices;

    private static DeviceRepository sDeviceRepository;
    private Context mAppContext;

    private DeviceRepository(Context appContext) {
        mAppContext = appContext;
        mDevices = new ArrayList<DeviceListItem>();
        for (int i = 0; i < 100; i++) {
            DeviceListItem c = new DeviceListItem("Device #" + i);
            c.setid(i+1);
            mDevices.add(c);
        }
    }

    public static DeviceRepository get(Context c) {
        if (sDeviceRepository == null) {
            sDeviceRepository = new DeviceRepository(c.getApplicationContext());
        }
        return sDeviceRepository;
    }

    public ArrayList<DeviceListItem> getDevices() {
        return mDevices;
    }
}

