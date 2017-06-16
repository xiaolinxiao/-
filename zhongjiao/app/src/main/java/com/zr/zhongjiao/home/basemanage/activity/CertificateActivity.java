package com.zr.zhongjiao.home.basemanage.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zr.zhongjiao.R;
import com.zr.zhongjiao.bean.ManCertificate;
import com.zr.zhongjiao.uibase.BaseBackTitleActivity;
import com.zr.zhongjiao.utils.LogUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 人员证书界面
 */
public class CertificateActivity extends BaseBackTitleActivity implements AdapterView.OnItemClickListener {

    private PullToRefreshListView pullToRefreshListView;
    private ListView listivew;
    private List<ManCertificate> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArgument(R.layout.activity_certificate, getString(R.string.ryzs));
        initData();
        initView();
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            ManCertificate manCertificate = new ManCertificate("", "李四（350321155304053968）", "建筑工程材料检测", "2021-7-21");
            dataList.add(manCertificate);
        }
    }

    private void initView() {
        pullToRefreshListView = (PullToRefreshListView) findViewById(R.id.pull_refresh_list);
        listivew = pullToRefreshListView.getRefreshableView();
        MyAdapter myAdapter = new MyAdapter();
        listivew.setAdapter(myAdapter);
        listivew.setOnItemClickListener(this);
    }

    /**
     * 点击效果 如果item中存在焦点获取的控件。button 之类的 则点击无效
     *
     * @param adapterView
     * @param view
     * @param i
     * @param l
     */
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        LogUtils.e("==onitemcolick==");
        startActivity(new Intent(this, CertificateDetailActivity.class));
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 30;
        }

        @Override
        public Object getItem(int i) {
            return dataList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = getLayoutInflater().inflate(R.layout.item_certificate, null);
            return inflate;
        }
    }
}
