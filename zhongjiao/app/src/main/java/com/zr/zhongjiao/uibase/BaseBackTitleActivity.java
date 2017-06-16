package com.zr.zhongjiao.uibase;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zr.zhongjiao.R;


/**
 * 顶部带有bcak返回的activity基类
 */
public class BaseBackTitleActivity extends BaseActivity {

    private TextView text_title;//标题
    private LinearLayout ll_content;//内容界面


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_back_title);
        initBaseTitleBackView();
    }

    /**
     * 控件初始化
     */
    private void initBaseTitleBackView() {
        Button btn_back = (Button) findViewById(R.id.base_btn_back);
        text_title = (TextView) findViewById(R.id.base_text_title);
        ll_content = (LinearLayout) findViewById(R.id.base_content);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    /**
     * 子类调用方法来加载具体的内容。
     *
     * @param layoutId
     * @param title
     */
    public void initArgument(int layoutId, String title) {
        //添加视图
        View content = getLayoutInflater().inflate(layoutId, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        ll_content.addView(content, layoutParams);
        text_title.setText("" + title);
    }
}
