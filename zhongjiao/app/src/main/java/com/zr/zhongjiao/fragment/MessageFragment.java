package com.zr.zhongjiao.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseFragment;

/**
 * 消息界面
 */
public class MessageFragment extends BaseFragment {
    private View view;

    public MessageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(getActivity(), getString(R.string.message), R.layout.fragment_message);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (null == view) {
            view = super.onCreateView(inflater, container, savedInstanceState);
        }
        return view;
    }
}
