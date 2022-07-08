package com.zcq.hostmodeble.ble.entity;

/**
 * Create by zcq on 7/8/22 10:42 AM
 */
public enum BleScanState {

    STATE_IDLE(-1), //闲置
    STATE_SCANNING(0x01); //扫描中

    private int code;

    BleScanState(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}