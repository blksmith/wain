package com.ttwg.wain.Device;

/**
 * Created by zj on 2016/1/4.
 */
public class DeviceItem {

    public int getid() {
        return mid;
    }

    public void setid(int id) {
        this.mid = id;
    }

    private int mid;

    private String mItemTitle;

    public String getItemTitle() {
        return mItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.mItemTitle = itemTitle;
    }
    public DeviceItem(String title)
    {
        mItemTitle = title;
    }
}
