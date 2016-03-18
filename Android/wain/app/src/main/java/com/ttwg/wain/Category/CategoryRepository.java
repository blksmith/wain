package com.ttwg.wain.Category;

import android.content.Context;

import com.ttwg.wain.Common.IMORepository;

import java.util.ArrayList;

/**
 * Created by zj on 2016/2/17.
 */
public class CategoryRepository implements IMORepository<CategoryItem> {
    private ArrayList<CategoryItem> mCategorys;

    private static CategoryRepository sCategoryRepository;
    private Context mAppContext;

    private CategoryRepository(Context appContext) {
        mAppContext = appContext;
        mCategorys = new ArrayList<CategoryItem>();

        mCategorys.add( new CategoryItem(0,"监控"));
        mCategorys.add(new CategoryItem(1, "报表"));
        mCategorys.add( new CategoryItem(2,"设置"));
        mCategorys.add( new CategoryItem(3,"用户"));
        mCategorys.add( new CategoryItem(4,"其它"));



    }

    public static CategoryRepository get(Context c) {
        if (sCategoryRepository == null) {
            synchronized (CategoryRepository.class) {
                if (sCategoryRepository == null) {
                    sCategoryRepository = new CategoryRepository(c.getApplicationContext());
                }
            }
        }
        return sCategoryRepository;
    }

    public ArrayList<CategoryItem> getCategorys() {
        return mCategorys;
    }

    @Override
    public ArrayList<CategoryItem> GetMOList(){return mCategorys;}
}
