package com.zr.zhongjiao.home.basemanage.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.bean.DeviceBean;
import com.zr.zhongjiao.uibase.BasePulltorefreshActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 仪器设备
 */
public class DeviceActivity extends BasePulltorefreshActivity {
    private List<DeviceBean> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBasePullToReFreshArgument(getString(R.string.yqsb));
        initData();
        initView();
    }

    private void initView() {
        listivew.setAdapter(new MyAdapter());
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            DeviceBean deviceBean = new DeviceBean("万能材料试验机", "HJS-002", "在用");
            dataList.add(deviceBean);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, DeviceDetailActivity.class));
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
            DeviceBean deviceBean = dataList.get(i);
            View inflate = getLayoutInflater().inflate(R.layout.item_certificate, null);
            TextView text_manname = (TextView) inflate.findViewById(R.id.item_manname);
            TextView text_code = (TextView) inflate.findViewById(R.id.item_certificatename);
            TextView text_status = (TextView) inflate.findViewById(R.id.item_time);
            TextView text1 = (TextView) inflate.findViewById(R.id.item_text1);
            TextView text2 = (TextView) inflate.findViewById(R.id.item_text2);
            TextView text3 = (TextView) inflate.findViewById(R.id.item_text3);
            text1.setText(R.string.sbmc);
            text2.setText(R.string.sbbh);
            text3.setText(R.string.syqk);
            text_manname.setText(deviceBean.name);
            text_code.setText(deviceBean.code);
            text_status.setText(deviceBean.status);
            return inflate;
        }
    }
}
