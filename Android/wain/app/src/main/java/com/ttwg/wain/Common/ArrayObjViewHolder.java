package com.ttwg.wain.Common;

import android.view.View;

/**
 * Created by zj on 2016/2/24.
 */
public abstract class ArrayObjViewHolder<T> {

    public abstract void InitControl(View view);
    public abstract void BindDataToControl(T item);
}
