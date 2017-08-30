package com.stateunion.p2p.research.retrofit.bean;

/**
 * Created by zhangguozheng on 2017/8/23.
 */

public interface IBaseBean {
    String getBizRequestId();
    String getTime();
    boolean isSuccess();
    String getCode();
    String getInfo();
    String getRequestId();
}
