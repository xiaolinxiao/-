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
import com.zr.zhongjiao.home.basemanage.activity.DeviceActivity;
import com.zr.zhongjiao.home.basemanage.activity.RecordsActivity;
import com.zr.zhongjiao.home.basemanage.activity.TopboxActivity;
import com.zr.zhongjiao.home.detectionmanage.ContractActivity;
import com.zr.zhongjiao.home.detectionmanage.EntrustActivity;
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
        /*--基础管理----*/
        LinearLayout ll_ryzs = (LinearLayout) inflate.findViewById(R.id.home_ll_ryzs);
        LinearLayout ll_yqsb = (LinearLayout) inflate.findViewById(R.id.home_ll_yqsb);
        LinearLayout ll_jdjl = (LinearLayout) inflate.findViewById(R.id.home_ll_jdjl);
        LinearLayout ll_jdh = (LinearLayout) inflate.findViewById(R.id.home_ll_jdh);
        ll_ryzs.setOnClickListener(this);
        ll_yqsb.setOnClickListener(this);
        ll_jdjl.setOnClickListener(this);
        ll_jdh.setOnClickListener(this);
        /*--检测管理----*/
        LinearLayout ll_jcht = (LinearLayout) inflate.findViewById(R.id.home_ll_jcht);
        LinearLayout ll_wtgl = (LinearLayout) inflate.findViewById(R.id.home_ll_wtgl);
        LinearLayout ll_ypxx = (LinearLayout) inflate.findViewById(R.id.home_ll_ypxx);
        LinearLayout ll_jcbg = (LinearLayout) inflate.findViewById(R.id.home_ll_jcbg);
        ll_jcht.setOnClickListener(this);
        ll_wtgl.setOnClickListener(this);
        ll_ypxx.setOnClickListener(this);
        ll_jcbg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_ll_ryzs:
                startActivity(new Intent(getActivity(), CertificateActivity.class));
                break;
            case R.id.home_ll_yqsb:
                startActivity(new Intent(getActivity(), DeviceActivity.class));
                break;
            case R.id.home_ll_jdjl:
                startActivity(new Intent(getActivity(), RecordsActivity.class));
                break;
            case R.id.home_ll_jdh:
                startActivity(new Intent(getActivity(), TopboxActivity.class));
                break;
            case R.id.home_ll_jcht:
                startActivity(new Intent(getActivity(), ContractActivity.class));
                break;
            case R.id.home_ll_wtgl:
                startActivity(new Intent(getActivity(), EntrustActivity.class));
                break;


        }
    }
}
