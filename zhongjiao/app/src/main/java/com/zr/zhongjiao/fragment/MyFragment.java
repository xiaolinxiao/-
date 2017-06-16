package com.zr.zhongjiao.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseFragment;
import com.zr.zhongjiao.user.LoginActivity;

/**
 * 我的界面
 */
public class MyFragment extends BaseFragment implements View.OnClickListener {
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
            initView();
        }
        return view;
    }

    private void initView() {
        RelativeLayout my_login = (RelativeLayout) view.findViewById(R.id.my_login);
        my_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_login:
                startActivity(new Intent(getActivity(), LoginActivity.class));
                break;
        }
    }
}
