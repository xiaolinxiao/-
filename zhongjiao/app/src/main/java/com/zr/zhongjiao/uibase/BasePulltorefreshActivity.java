package com.zr.zhongjiao.uibase;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zr.zhongjiao.R;

/**
 * 带刷新listview的基类
 */
public abstract class BasePulltorefreshActivity extends BaseBackTitleActivity implements AdapterView.OnItemClickListener {
    protected PullToRefreshListView pullToRefreshListView;
    protected ListView listivew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 子类必须调用该方法来加载相关的数据
     *
     * @param title
     */
    public void initBasePullToReFreshArgument(String title) {
        initArgument(R.layout.activity_base_pulltorefresh, title);
        initBasePullToRefreshView();
    }

    private void initBasePullToRefreshView() {
        pullToRefreshListView = (PullToRefreshListView) findViewById(R.id.pull_refresh_list);
        listivew = pullToRefreshListView.getRefreshableView();
        listivew.setOnItemClickListener(this);
    }

    @Override
    public abstract void onItemClick(AdapterView<?> parent, View view, int position, long id);
}
