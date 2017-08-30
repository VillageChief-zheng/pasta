package com.stateunion.p2p.research.retrofit;


import com.stateunion.p2p.research.retrofit.entiity.UserInfoBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by zhangguozheng on 2017/8/23.
 */

public interface ServiceApi {
    /**
     * 提交注册
     *
     * @param useLoginName
     * @param useLoginPswd
     * @param useEmail
     * @param useMobile
     * @param idfa
     * @param identify
     * @param friendId
     * @return
     */
    @POST("api/user/userinfo")
    @FormUrlEncoded
    Call<RequestBody> register(@Field("useLoginName") String useLoginName,
                               @Field("useLoginPswd") String useLoginPswd,
                               @Field("useEmail") String useEmail,
                               @Field("useMobile") String useMobile,
                               @Field("idfa") String idfa,
                               @Field("identify") String identify,
                               @Field("friendId") String friendId);
    /**
     * 密码登录
     *
     * @param useLoginName
     * @param useLoginPswd
     * @param identify
     * @param uuid
     * @return
     */
    /**
     *
     */
    @POST("service/user/login")
    @FormUrlEncoded
    Call<UserInfoBean> passwordLogin(@Field("useLoginName") String useLoginName,
                                     @Field("useLoginPswd") String useLoginPswd,
                                     @Field("identify") String identify,
                                     @Field("uuid") String uuid
    );
}
