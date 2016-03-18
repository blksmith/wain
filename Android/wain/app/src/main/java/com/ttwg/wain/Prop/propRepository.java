package com.ttwg.wain.Prop;

import android.content.Context;

import com.ttwg.wain.Common.IMORepository;

import java.util.ArrayList;

/**
 * Created by zj on 2016/1/19.
 */
public class PropRepository implements IMORepository<PropItem>{
    private ArrayList<PropItem> mDevices;

    private static PropRepository sDeviceRepository;
    private Context mAppContext;

    private PropRepository(Context appContext) {
        mAppContext = appContext;
        mDevices = new ArrayList<PropItem>();
        for (int i = 0; i < 100; i++) {
            PropItem c = new PropItem("Device #" + i);
            c.setid(+1);
            mDevices.add(c);
        }
    }

    public static PropRepository get(Context c) {
        if (sDeviceRepository == null) {
                synchronized (PropRepository.class) {
                    if (sDeviceRepository == null) {
                        sDeviceRepository = new PropRepository(c.getApplicationContext());
                    }
                }
        }
        return sDeviceRepository;
    }

    public ArrayList<PropItem> getDevices() {
        return mDevices;
    }

    @Override
    public ArrayList<PropItem> GetMOList(){return mDevices;}
}

