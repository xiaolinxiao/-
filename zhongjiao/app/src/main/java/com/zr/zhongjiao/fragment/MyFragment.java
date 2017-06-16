package com.zr.zhongjiao.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseFragment;

/**
 * 我的界面
 */
public class MyFragment extends BaseFragment {
    private View view;

    public MyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(getActivity(), getString(R.string.minecenter), R.layout.fragment_my);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (null == view) {
            view = super.onCreateView(inflater, container, savedInstanceState);
        }
        return view;
    }
}
