package com.ttwg.wain.DeviceGroup;

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
public class deviceGroupFragment extends MOListFragment<DeviceGroupItem> {

    protected  IMORepository<DeviceGroupItem> GetRepository()
    {
        return DeviceGroupRepository.get(getActivity());
    };
    protected  ArrayObjAdapter<DeviceGroupItem> GetAdapter(){
        return new DeviceGroupListAdapter(getActivity(),GetRepository().GetMOList());
    };
    protected  int GetListViewLayoutId()
    {
        return R.layout.fragment_device_grid;
    };
    protected  int GetListViewId(){
        return R.id.grid;
    };




}
