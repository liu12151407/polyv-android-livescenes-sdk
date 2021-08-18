package com.easefun.polyv.livecloudclass.wsx;

/**
 * 静态长量
 */
public class PolyvFinal {
    /**
     * 仅仅显示直播详情（未播放或者已经结束了）
     * 1：限制显示
     * 0：不限制
     */
    public static int onlyLiveInfo = 1;
    /**
     * 是否收藏
     */
    public static int isCollection = 0;
    /**
     * 是否需要弹出支付提示
     */
    public static int needCallPayAlter = 0;
    /**
     * 支付价格
     */
    public static String price = "";
    /**
     * 是否显示收藏
     */
    public static int showCollection = 0;
    /**
     * 是否显示分享
     */
    public static int showShare = 1;
    /**
     * 介绍信息(html源码信息)，权重比后台设置的高，如果传入有值则强制显示
     * 如果这里不传值，则已后台设置为准
     */
    public static String introduceInfo = "";
}
