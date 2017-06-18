package com.zr.zhongjiao.home.detectionmanage;

import android.os.Bundle;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;

/**
 * 检测合同信息详情
 */
public class ContractDetailActivity extends BaseBackTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(R.layout.activity_contract_detail, getString(R.string.jchtxxxq));
    }
}
