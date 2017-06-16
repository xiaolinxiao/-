package com.zr.zhongjiao;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.zr.zhongjiao.fragment.HomeFragment;
import com.zr.zhongjiao.fragment.MessageFragment;
import com.zr.zhongjiao.fragment.MyFragment;
import com.zr.zhongjiao.uibase.BaseActivity;

public class MainActivity extends BaseActivity implements TabHost.OnTabChangeListener {

    private FragmentManager supportFragmentManager;
    private FragmentTabHost mTabHost;
    private String[] tagArray = {"myfragment", "homefragment", "messagefragment"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        supportFragmentManager = getSupportFragmentManager();
        mTabHost.setup(this, supportFragmentManager, R.id.realtabcontent);
        setAddTab(tagArray[0], R.string.my, MyFragment.class, R.drawable.inducator_user_selector);
        setAddTab(tagArray[1], R.string.home, HomeFragment.class, R.drawable.inducator_home_selector);
        setAddTab(tagArray[2], R.string.message, MessageFragment.class, R.drawable.inducator_msg_selector);
        mTabHost.setCurrentTab(1);
        mTabHost.setOnTabChangedListener(this);
    }


    /**
     * @param indicator 标签
     * @param cls       Fragment Class
     * @param srcID     背景
     */
    private void setAddTab(String tag, int indicator, Class<?> cls, int srcID) {
        TabHost.TabSpec newTabSpec = mTabHost.newTabSpec(tag);
        final View view = getLayoutInflater().inflate(R.layout.item_inducator, null);
        TextView textView;
        textView = (TextView) view.findViewById(R.id.inducator_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.inducator_image);
        textView.setText(getResources().getString(indicator));
        textView.setTextSize(14);
        imageView.setBackgroundResource(srcID);
        mTabHost.addTab(newTabSpec.setIndicator(view), cls, null);
    }

    @Override
    public void onTabChanged(String s) {

    }
}
