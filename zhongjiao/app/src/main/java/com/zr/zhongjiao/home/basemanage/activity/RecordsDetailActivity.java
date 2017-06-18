package com.zr.zhongjiao.home.basemanage.activity;

import android.os.Bundle;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;

/**
 * 设备检定详情
 */
public class RecordsDetailActivity extends BaseBackTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(R.layout.activity_records_detail, getString(R.string.sbjdxq));
    }
}
