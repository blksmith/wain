package com.ttwg.wain.Prop;

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
public class PropFragment extends MOListFragment<PropItem> {

    protected  IMORepository<PropItem> GetRepository()
    {
        return PropRepository.get(getActivity());
    };
    protected  ArrayObjAdapter<PropItem> GetAdapter(){
        return new PropListAdapter(getActivity(),GetRepository().GetMOList());
    };
    protected  int GetListViewLayoutId()
    {
        return R.layout.fragment_device_list;
    };
    protected  int GetListViewId(){
        return R.id.list2;
    };




}
