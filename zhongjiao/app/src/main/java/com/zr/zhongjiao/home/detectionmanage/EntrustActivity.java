package com.zr.zhongjiao.home.detectionmanage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.bean.EntrustBean;
import com.zr.zhongjiao.uibase.BasePulltorefreshActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 委托管理界面
 */
public class EntrustActivity extends BasePulltorefreshActivity {
    private List<EntrustBean> dataList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBasePullToReFreshArgument(getString(R.string.wtgl));
        initData();
        initView();
    }

    private void initView() {
        listivew.setAdapter(new MyAdapter());
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            EntrustBean entrustBean = new EntrustBean("中交三公局（北京）工程试验检测有限公司\\n福州地铁二号线项目检测中心", "预拌混凝土原材料检测", "00107");
            dataList.add(entrustBean);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, EntrustDetailActivity.class));
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return dataList.size();
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
            EntrustBean bean = dataList.get(i);
            View inflate = getLayoutInflater().inflate(R.layout.item_certificate, null);
            TextView text_jcjg = (TextView) inflate.findViewById(R.id.item_manname);
            TextView text_porject = (TextView) inflate.findViewById(R.id.item_certificatename);
            TextView text_code = (TextView) inflate.findViewById(R.id.item_time);
            TextView text1 = (TextView) inflate.findViewById(R.id.item_text1);
            TextView text2 = (TextView) inflate.findViewById(R.id.item_text2);
            TextView text3 = (TextView) inflate.findViewById(R.id.item_text3);
            text1.setText(R.string.jcjg);
            text2.setText(R.string.jcxm);
            text3.setText(R.string.wtbh);
            text_jcjg.setText(bean.jcjg);
            text_porject.setText(bean.project);
            text_code.setText(bean.code);
            return inflate;
        }
    }
}
