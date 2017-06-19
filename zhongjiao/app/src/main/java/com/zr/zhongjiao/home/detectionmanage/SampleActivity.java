package com.zr.zhongjiao.home.detectionmanage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zr.zhongjiao.R;
import com.zr.zhongjiao.bean.SampleBean;
import com.zr.zhongjiao.uibase.BasePulltorefreshActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * 样品信息
 */
public class SampleActivity extends BasePulltorefreshActivity {
    private List<SampleBean> dataList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBasePullToReFreshArgument(getString(R.string.ypxx));
        initData();
        initView();
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            SampleBean sampleBean = new SampleBean("中交三公局（北京）工程试验检测有限公司\\n福州地铁二号线项目检测中心", "混凝土抗压", "K1100107");
            dataList.add(sampleBean);
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
            SampleBean bean = dataList.get(i);
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
