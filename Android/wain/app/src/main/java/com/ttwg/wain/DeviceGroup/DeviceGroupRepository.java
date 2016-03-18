package com.ttwg.wain.DeviceGroup;

import android.content.Context;

import com.ttwg.wain.Common.IMORepository;

import java.util.ArrayList;

/**
 * Created by zj on 2016/1/19.
 */
public class DeviceGroupRepository implements IMORepository<DeviceGroupItem>{
    private ArrayList<DeviceGroupItem> mDeviceGroups;

    private static DeviceGroupRepository sDeviceRepository;
    private Context mAppContext;



    private DeviceGroupRepository(Context appContext) {
        mAppContext = appContext;
        mDeviceGroups = new ArrayList<DeviceGroupItem>();
        for (int i = 0; i < 100; i++) {
            DeviceGroupItem c = new DeviceGroupItem("Device Group#" + i);
            c.setid(+1);
            mDeviceGroups.add(c);
        }
    }

    public static DeviceGroupRepository get(Context c) {
        if (sDeviceRepository == null) {
                synchronized (DeviceGroupRepository.class) {
                    if (sDeviceRepository == null) {
                        sDeviceRepository = new DeviceGroupRepository(c.getApplicationContext());
                    }
                }
        }
        return sDeviceRepository;
    }

    public ArrayList<DeviceGroupItem> getDevices() {
        return mDeviceGroups;
    }

    @Override
    public ArrayList<DeviceGroupItem> GetMOList(){return mDeviceGroups;}
}

