package com.ttwg.wain.DeviceGroup;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ttwg.wain.Category.CategoryFragment;
import com.ttwg.wain.Device.deviceFragment;
import com.ttwg.wain.R;

/**
 * Created by zj on 2016/3/9.
 */
public class DeviceGroupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragmentContainer);
        if (fragment == null) {
            fragment = new deviceGroupFragment();
            manager.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}
