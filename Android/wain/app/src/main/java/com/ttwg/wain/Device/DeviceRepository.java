package com.ttwg.wain.Device;

import android.content.Context;

import com.ttwg.wain.Common.IMORepository;

import java.util.ArrayList;

/**
 * Created by zj on 2016/1/19.
 */
public class DeviceRepository implements IMORepository<DeviceItem>{
    private ArrayList<DeviceItem> mDevices;

    private static DeviceRepository sDeviceRepository;
    private Context mAppContext;



    private DeviceRepository(Context appContext) {
        mAppContext = appContext;
        mDevices = new ArrayList<DeviceItem>();
        for (int i = 0; i < 100; i++) {
            DeviceItem c = new DeviceItem("Device #" + i);
            c.setid(+1);
            mDevices.add(c);
        }
    }

    public static DeviceRepository get(Context c) {
        if (sDeviceRepository == null) {
                synchronized (DeviceRepository.class) {
                    if (sDeviceRepository == null) {
                        sDeviceRepository = new DeviceRepository(c.getApplicationContext());
                    }
                }
        }
        return sDeviceRepository;
    }

    public ArrayList<DeviceItem> getDevices() {
        return mDevices;
    }

    @Override
    public ArrayList<DeviceItem> GetMOList(){return mDevices;}
}

