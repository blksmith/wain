package com.ttwg.wain;

/**
 * Created by zj on 2016/1/4.
 */
public class DeviceListItem {

    public int getid() {
        return mid;
    }

    public void setid(int id) {
        this.mid = mid;
    }

    private int mid;

    private String mItemTitle;

    public String getItemTitle() {
        return mItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.mItemTitle = itemTitle;
    }
    public DeviceListItem(String title)
    {
        mItemTitle = title;
    }
}
