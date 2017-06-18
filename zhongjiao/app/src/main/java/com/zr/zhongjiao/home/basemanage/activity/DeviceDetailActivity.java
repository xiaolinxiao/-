package com.zr.zhongjiao.home.basemanage.activity;

import android.os.Bundle;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;

/**
 * 仪器设备详情界面
 */
public class DeviceDetailActivity extends BaseBackTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(R.layout.activity_device_detail, getString(R.string.yqsbxq));
    }
}
