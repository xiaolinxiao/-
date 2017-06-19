package com.zr.zhongjiao.bean;

/**
 * Created by ASUS on 2017/6/19.
 * 检测报告
 */

public class ReportBean {
    public String jcjg;
    public String project;
    public String code;

    public ReportBean(String jcjg, String project, String code) {
        this.jcjg = jcjg;
        this.project = project;
        this.code = code;
    }
}
