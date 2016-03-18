package com.ttwg.wain.Common;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ttwg.wain.R;

import java.util.ArrayList;

/**
 * Created by zj on 2016/3/1.
 */
public abstract class MOListFragment<T> extends Fragment {


    private ArrayObjAdapter<T>  mAdapter;
    private ArrayList<T> mMOObjs;

    private  IMORepository<T> mRepository;


    protected abstract   IMORepository<T> GetRepository();
    protected abstract  ArrayObjAdapter<T> GetAdapter();
    protected abstract int GetListViewLayoutId();
    protected abstract int GetListViewId();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRepository = GetRepository();
        mMOObjs =mRepository.GetMOList();

        // TODO: Change Adapter to display your content
        mAdapter = GetAdapter();

        //setListAdapter(mAdapter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(GetListViewLayoutId(),container,false);
        AbsListView list = (AbsListView)v.findViewById(GetListViewId());
        list.setAdapter(mAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                onListItemClick((AbsListView)parent,view,position,id);
            }
        });


        return v;
    }


    protected void onListItemClick(AbsListView l, View v, int position, long id) {

        Log.d("helleo","clicked");
    }


}

