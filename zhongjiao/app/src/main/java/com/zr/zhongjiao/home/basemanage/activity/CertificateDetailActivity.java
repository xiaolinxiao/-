package com.zr.zhongjiao.home.basemanage.activity;

import android.os.Bundle;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;

public class CertificateDetailActivity extends BaseBackTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(R.layout.activity_certificate_detail, getString(R.string.ryzs));
    }
}
