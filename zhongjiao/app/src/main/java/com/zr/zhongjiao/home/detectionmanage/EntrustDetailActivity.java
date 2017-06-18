package com.zr.zhongjiao.home.detectionmanage;

import android.os.Bundle;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;

/**
 * 委托协议书详情
 */
public class EntrustDetailActivity extends BaseBackTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(R.layout.activity_entrust_detail, getString(R.string.wtxysxq));
    }
}
