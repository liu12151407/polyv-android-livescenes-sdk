package com.easefun.polyv.livecloudclass.wsx;

/**
 * 监听器
 */
public interface WsxMonitor {
    /**
     * 监听状态
     */
    void StateCallBack();

    /**
     * 开会员
     */
    void openVip();

    /**
     * 支付钱
     */
    void payMoney();

}
