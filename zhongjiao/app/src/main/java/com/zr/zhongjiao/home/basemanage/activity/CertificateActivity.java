package com.zr.zhongjiao.home.basemanage.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.bean.ManCertificateBean;
import com.zr.zhongjiao.uibase.BasePulltorefreshActivity;
import com.zr.zhongjiao.utils.LogUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 人员证书界面
 */
public class CertificateActivity extends BasePulltorefreshActivity {

    private List<ManCertificateBean> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBasePullToReFreshArgument(getString(R.string.ryzs));
        initData();
        initView();
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            ManCertificateBean manCertificate = new ManCertificateBean("", "李四（350321155304053968）", "建筑工程材料检测", "2021-7-21");
            dataList.add(manCertificate);
        }
    }

    private void initView() {
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
            ManCertificateBean bean = dataList.get(i);
            View inflate = getLayoutInflater().inflate(R.layout.item_certificate, null);
            TextView text_manname = (TextView) inflate.findViewById(R.id.item_manname);
            TextView text_certifiname = (TextView) inflate.findViewById(R.id.item_certificatename);
            TextView text_endtiem = (TextView) inflate.findViewById(R.id.item_time);
            text_manname.setText(bean.manName);
            text_certifiname.setText(bean.certifiName);
            text_endtiem.setText(bean.endTime);
            return inflate;
        }
    }
}
