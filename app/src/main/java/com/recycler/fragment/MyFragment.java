package com.recycler.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by smartron on 21/12/17.
 */

public class MyFragment extends Fragment {
    public static final String TAG = "MyFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.my_fragment, container, false);
        String a=getArguments().getString("a");
        ((TextView)v.findViewById(R.id.fragment_tv)).setText(a);
        return v;
    }
}
