package com.zr.zhongjiao.bean;

/**
 * Created by ASUS on 2017/6/17.
 * 仪器设备
 */

public class DeviceBean {
    public String name;
    public String code;
    public String status;

    public DeviceBean(String name, String code, String status) {
        this.name = name;
        this.code = code;
        this.status = status;
    }
}
