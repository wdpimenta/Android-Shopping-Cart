package com.qemasoft.alhabibshop.app.view.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

import com.qemasoft.alhabibshop.app.Utils;

/**
 * Created by Inzimam on 11-Nov-17.
 */

public class MyBaseFragment extends Fragment {

    public Context context;
    public Utils utils;
    public RecyclerView mRecyclerView;

    public MyBaseFragment() {

    }

    protected void initUtils() {
        this.context = getActivity();
        this.utils = new Utils(getActivity());
    }

}
