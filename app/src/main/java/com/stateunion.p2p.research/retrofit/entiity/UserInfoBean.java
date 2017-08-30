package com.stateunion.p2p.research.retrofit.entiity;

import com.google.gson.annotations.SerializedName;
import com.stateunion.p2p.research.retrofit.bean.BaseBean;

/**
 * Created by zhangguozheng on 2017/8/25.
 */

public class UserInfoBean extends BaseBean {
         private LoginResultEntity body;
     public LoginResultEntity getBody() {
        return body;
    }

    public void setBody(LoginResultEntity body) {
        this.body = body;
    }
}
