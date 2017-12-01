package com.qemasoft.alhabibshop.app.view.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

import com.qemasoft.alhabibshop.app.R;
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

    protected void switchFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragments, fragment).commit();
    }

    protected void switchFragment(Fragment fragment, Bundle bundle) {

        if (bundle != null) {
            fragment.setArguments(bundle);
        }
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragments, fragment).commit();
    }
}
