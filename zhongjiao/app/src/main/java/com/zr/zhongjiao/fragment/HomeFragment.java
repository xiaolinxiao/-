package com.zr.zhongjiao.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.home.basemanage.activity.CertificateActivity;
import com.zr.zhongjiao.uibase.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 * 主界面
 */
public class HomeFragment extends BaseFragment implements View.OnClickListener {


    private View inflate;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(getActivity(), getString(R.string.home), R.layout.fragment_home);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (null == inflate) {
            inflate = super.onCreateView(inflater, container, savedInstanceState);
            initView();
        }
        return inflate;
    }

    private void initView() {
        LinearLayout ll_ryzs = (LinearLayout) inflate.findViewById(R.id.home_ll_ryzs);
        ll_ryzs.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_ll_ryzs:
                startActivity(new Intent(getActivity(), CertificateActivity.class));
                break;
        }
    }
}
