package com.zcq.hostmodeble.ble.entity;

/**
 * Create by zcq on 7/8/22 11:37 AM
 */
public class BleConnectStateParameter {

    private int status;
    private boolean isActive;

    public BleConnectStateParameter(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}