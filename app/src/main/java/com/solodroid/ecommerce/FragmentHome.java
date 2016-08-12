package com.solodroid.ecommerce;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class FragmentHome extends Fragment {
    GridView gv;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.gridview_fragment, container, false);
        gv = (GridView) view.findViewById(R.id.gv);
        gv.setAdapter(new gvAdapter(getActivity()));
        return view;
    }

}