package com.stateunion.p2p.research.commons;

/**
 * Created by zhangguozheng on 2017/08/28
 * <p>
 * 配置页面，用于切换不同的环境
 * <p>
 * <p>
 * 在切换不同环境的时候还需要在清单文件中修改极光推送的JPUSH_APPKEY       ************************
 * 检查微信KEY
 * <p>
 * <p>
 * <p>
 * 360市场  修改logo页面
 * <p>
 * 马甲包需要修改  JPUSH_APPKEY  和微信key
 * <p>
 * <p>
 * BaseUrl;密钥;邀请好友URL;网站公告基础URL;自动投标规则URL;极光APPKEY;微信APPKEY;LOGO页;ApplicationId;应用名;渠道号;
 */
public class Config {
    /**
     * 在gradle中配置,切换环境不用修改
     */
 /*   public static final String publicKey = BuildConfig.KEYBOARD_PUBLIC_KEY;
   *//* public final static String FRIEND_INVITATION_BASE_URL = BuildConfig.FRIEND_INVITATION_BASE_URL; // 好友邀请
    public final static String WEBVIEW_BASE_URL = BuildConfig.WEBVIEW_BASE_URL; // 网站公告、小易指南使用*//*
    *//*public final static String URL_AUTOMATIC = BuildConfig.AUTO_BIDDING_RULES;//自动投标*/

    public static String HTTPS_URL = "https://api.etongdai.com/";


}
