package com.zr.zhongjiao.home.basemanage.activity;

import android.os.Bundle;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;

/**
 * 机顶盒详情界面
 */
public class TopboxDetailActivity extends BaseBackTitleActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(R.layout.activity_topbox_detail,getString(R.string.jdhxq));
    }
}
