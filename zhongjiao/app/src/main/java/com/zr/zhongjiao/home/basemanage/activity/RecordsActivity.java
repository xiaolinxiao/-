package com.zr.zhongjiao.home.basemanage.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.bean.RecordBean;
import com.zr.zhongjiao.uibase.BasePulltorefreshActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 鉴定记录
 */
public class RecordsActivity extends BasePulltorefreshActivity {
    private List<RecordBean> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBasePullToReFreshArgument(getString(R.string.jdjl));
        initData();
        initView();
    }

    private void initView() {
        listivew.setAdapter(new MyAdapter());
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            RecordBean recordBean = new RecordBean("静载仪（YZ-248-49）", "2016-7-31", "2017-7-31");
            dataList.add(recordBean);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, RecordsDetailActivity.class));
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
            RecordBean bean = dataList.get(i);
            View inflate = getLayoutInflater().inflate(R.layout.item_certificate, null);
            TextView text_name = (TextView) inflate.findViewById(R.id.item_manname);
            TextView text_jdtime = (TextView) inflate.findViewById(R.id.item_certificatename);
            TextView text_endtime = (TextView) inflate.findViewById(R.id.item_time);
            TextView text1 = (TextView) inflate.findViewById(R.id.item_text1);
            TextView text2 = (TextView) inflate.findViewById(R.id.item_text2);
            TextView text3 = (TextView) inflate.findViewById(R.id.item_text3);
            text1.setText(R.string.sbmc);
            text2.setText(R.string.jdsj);
            text3.setText(R.string.dqsj);
            text_name.setText(bean.name);
            text_jdtime.setText(bean.jdtime);
            text_jdtime.setTextColor(getResources().getColor(R.color.green));
            text_endtime.setText(bean.endtiem);
            text_endtime.setTextColor(getResources().getColor(R.color.red));
            return inflate;
        }
    }

}
