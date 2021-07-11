package com.easefun.polyv.livecloudclass.wsx;

/**
 * 监听器
 */
public interface WsxMonitor {
    /**
     * 开会员
     */
    void openVip();

    /**
     * 支付钱
     */
    void payMoney();

    /**
     * 分享
     */
    void share();

    /**
     * 收藏
     */
    void collection();
}
