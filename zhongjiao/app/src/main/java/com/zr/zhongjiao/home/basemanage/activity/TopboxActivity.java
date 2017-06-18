package com.zr.zhongjiao.home.basemanage.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.bean.TopboxBean;
import com.zr.zhongjiao.uibase.BasePulltorefreshActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 机顶盒
 */
public class TopboxActivity extends BasePulltorefreshActivity {
    private List<TopboxBean> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBasePullToReFreshArgument(getString(R.string.jdh));
        iniData();
        initView();

    }

    private void initView() {
        listivew.setAdapter(new MyAdapter());
    }

    private void iniData() {
        for (int i = 0; i < 30; i++) {
            TopboxBean topboxBean = new TopboxBean("中交三公局（北京）工程试验检测有限公司\\n福州地铁二号线项目检测中心", "JDH075006829-1", "机顶盒与局域网连接断开");
            dataList.add(topboxBean);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, TopboxDetailActivity.class));
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
            TopboxBean bean = dataList.get(i);
            View inflate = getLayoutInflater().inflate(R.layout.item_certificate, null);
            TextView text_jcjg = (TextView) inflate.findViewById(R.id.item_manname);
            TextView text_code = (TextView) inflate.findViewById(R.id.item_certificatename);
            TextView text_status = (TextView) inflate.findViewById(R.id.item_time);
            TextView text1 = (TextView) inflate.findViewById(R.id.item_text1);
            TextView text2 = (TextView) inflate.findViewById(R.id.item_text2);
            TextView text3 = (TextView) inflate.findViewById(R.id.item_text3);
            text1.setText(R.string.jcjg);
            text2.setText(R.string.jdhbh);
            text3.setText(R.string.ststus);
            text_jcjg.setText(bean.jgname);
            text_code.setText(bean.boxname);
            text_status.setText(bean.status);
            text_status.setTextColor(getResources().getColor(R.color.red));
            text_status.setTextSize(12);
            return inflate;
        }
    }
}
