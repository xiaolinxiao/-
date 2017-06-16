package com.zr.zhongjiao.bean;

/**
 * Created by Administrator on 2017/6/16.
 * 人员证书
 */

public class ManCertificate {
    public String url;
    public String manName;
    public String certifiName;
    public String endTime;

    public ManCertificate(String url, String manName, String certifiName, String endTime) {
        this.url = url;
        this.manName = manName;
        this.certifiName = certifiName;
        this.endTime = endTime;
    }
}
