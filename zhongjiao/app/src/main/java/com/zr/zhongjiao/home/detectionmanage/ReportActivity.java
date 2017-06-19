package com.zr.zhongjiao.home.detectionmanage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.bean.ReportBean;
import com.zr.zhongjiao.uibase.BasePulltorefreshActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 检测报告
 */
public class ReportActivity extends BasePulltorefreshActivity {
    private List<ReportBean> dataList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBasePullToReFreshArgument(getString(R.string.jcbg));
        initData();
        initView();
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            ReportBean bean = new ReportBean("中交三公局（北京）工程试验检测有限公司\\n福州地铁二号线项目检测中心", "福州市轨道交通2号线工程检测董宇站", "n福州地铁二号线项目检测中心试验室");
            dataList.add(bean);
        }
    }

    private void initView() {
        listivew.setAdapter(new MyAdapter());
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

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
            ReportBean bean = dataList.get(i);
            View inflate = getLayoutInflater().inflate(R.layout.item_certificate, null);
            TextView text_jcjg = (TextView) inflate.findViewById(R.id.item_manname);
            TextView text_porject = (TextView) inflate.findViewById(R.id.item_certificatename);
            TextView text_code = (TextView) inflate.findViewById(R.id.item_time);
            TextView text1 = (TextView) inflate.findViewById(R.id.item_text1);
            TextView text2 = (TextView) inflate.findViewById(R.id.item_text2);
            TextView text3 = (TextView) inflate.findViewById(R.id.item_text3);
            text1.setText(R.string.jcjg);
            text2.setText(R.string.jcxm);
            text3.setText(R.string.ypbh);
            text_jcjg.setText(bean.jcjg);
            text_porject.setText(bean.project);
            text_code.setText(bean.code);
            return inflate;
        }
    }
}
