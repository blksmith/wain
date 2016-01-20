package com.ttwg.wain;

import android.app.Activity;
import android.app.ListFragment;
import android.bluetooth.BluetoothClass;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A fragment representing a list of Items.
 * <p>
 * Large screen devices (such as tablets) are supported by replacing the ListView
 * with a GridView.
 * <p>
 * Activities containing this fragment MUST implement the {@link OnFragmentInteractionListener}
 * interface.
 */
public class deviceFragment extends ListFragment {


    private DeviceListAdapter mAdapter;
    private  ArrayList<DeviceListItem> mDevices;



    public deviceFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     mDevices = DeviceRepository.get(getActivity()).getDevices();

      // TODO: Change Adapter to display your content
        mAdapter = new DeviceListAdapter(getActivity(), mDevices);
        setListAdapter(mAdapter);
    }




    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

    }


}
