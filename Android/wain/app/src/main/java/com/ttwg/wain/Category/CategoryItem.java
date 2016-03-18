package com.ttwg.wain.Category;

/**
 * Created by zj on 2016/2/17.
 */
public class CategoryItem {
    private int mId;
    private int mIndex;
    private String mName;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }


    public int getIndex() {
        return mIndex;
    }

    public void setIndex(int index) {
        mIndex = index;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public CategoryItem(int index,String name)
    {
        mIndex = index;
        mName = name;
    }
}
