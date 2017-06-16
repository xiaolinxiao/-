package com.zr.zhongjiao.user;

import android.os.Bundle;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;

/**
 * 登录中心
 */
public class LoginActivity extends BaseBackTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //<activity Android:windowSoftInputMode="adjustPan" >
        initArgument(R.layout.activity_login, getString(R.string.login));
    }
}
