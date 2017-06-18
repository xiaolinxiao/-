package com.zr.zhongjiao.bean;

/**
 * Created by ASUS on 2017/6/18.
 * 检测合同
 */

public class ContractBean {
    public String jcjgname;
    public String contractcode;
    public String type;

    public ContractBean(String type, String jcjgname, String contractcode) {
        this.type = type;
        this.jcjgname = jcjgname;
        this.contractcode = contractcode;
    }
}
