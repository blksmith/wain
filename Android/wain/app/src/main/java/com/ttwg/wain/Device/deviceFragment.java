package com.ttwg.wain.Device;

import com.ttwg.wain.Common.ArrayObjAdapter;
import com.ttwg.wain.Common.IMORepository;
import com.ttwg.wain.Common.MOListFragment;
import com.ttwg.wain.R;


/**
 * A fragment representing a list of Items.
 * <p>
 * Large screen devices (such as tablets) are supported by replacing the ListView
 * with a GridView.
 * <p>
 * Activities containing this fragment MUST implement the {@link OnFragmentInteractionListener}
 * interface.
 */
public class deviceFragment extends MOListFragment<DeviceItem> {

    protected  IMORepository<DeviceItem> GetRepository()
    {
        return DeviceRepository.get(getActivity());
    };
    protected  ArrayObjAdapter<DeviceItem> GetAdapter(){
        return new DeviceListAdapter(getActivity(),GetRepository().GetMOList());
    };
    protected  int GetListViewLayoutId()
    {
        return R.layout.fragment_device_list;
    };
    protected  int GetListViewId(){
        return R.id.list2;
    };




}
