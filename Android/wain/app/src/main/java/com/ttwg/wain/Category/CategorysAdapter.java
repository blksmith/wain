package com.ttwg.wain.Category;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.ttwg.wain.Common.ArrayObjAdapter;
import com.ttwg.wain.Common.ArrayObjViewHolder;
import com.ttwg.wain.R;

import java.util.ArrayList;

/**
 * Created by zj on 2016/2/17.
 */
public class CategorysAdapter extends ArrayObjAdapter<CategoryItem> {

    public CategorysAdapter(Context context, ArrayList<CategoryItem> items) {
        super(context, items);


    }

    @Override
    protected ArrayObjViewHolder<CategoryItem> CreateViewHolder() {
        return new CategoryViewHolder();
    }


    @Override
    protected int GetLayoutId() {
        return R.layout.device_list_item;
    }

    private class CategoryViewHolder extends ArrayObjViewHolder<CategoryItem> {
        private TextView titleText;
        private TextView idText;

        @Override
        public void InitControl(View view) {
            idText = (TextView) view.findViewById(R.id.idTextView);
            titleText = (TextView) view.findViewById(R.id.titleTextView);
        }

        @Override
        public void BindDataToControl(CategoryItem item) {
            titleText.setText(item.getName());
            //idText.setText(String.valueOf(item.getid()));

        }
    }
}
