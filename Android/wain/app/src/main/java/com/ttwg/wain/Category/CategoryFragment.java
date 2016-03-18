package com.ttwg.wain.Category;

import android.content.Intent;
import android.view.View;
import android.widget.AbsListView;

import com.ttwg.wain.Common.ArrayObjAdapter;
import com.ttwg.wain.Common.IMORepository;
import com.ttwg.wain.Common.MOListFragment;
import com.ttwg.wain.DeviceGroup.DeviceGroupActivity;
import com.ttwg.wain.R;

/**
 * Created by zj on 2016/2/17.
 */
public class CategoryFragment extends MOListFragment<CategoryItem> {
    @Override
    protected IMORepository<CategoryItem> GetRepository() {
        return CategoryRepository.get(getActivity());
    }

    @Override
    protected ArrayObjAdapter<CategoryItem> GetAdapter() {
        return new CategorysAdapter(getActivity(),GetRepository().GetMOList());
    }

    @Override
    protected int GetListViewLayoutId() {
        return R.layout.fragment_device_grid;
    }

    @Override
    protected int GetListViewId() {
        return R.id.grid;
    }



    @Override
    protected void onListItemClick(AbsListView l, View v, int position, long id) {

        Intent  i =  new Intent(getActivity(), DeviceGroupActivity.class);
        startActivity(i);
    }
}
