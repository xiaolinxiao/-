package com.zr.zhongjiao.home.basemanage.activity;

import android.os.Bundle;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;

/**
 * 人员证书界面
 */
public class CertificateActivity extends BaseBackTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(R.layout.activity_certificate, getString(R.string.ryzs));
    }
}
