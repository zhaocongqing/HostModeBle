package com.zcq.hostmodeble.ble.exception;

/**
 * Create by zcq on 7/8/22 11:05 AM
 */
public class GattException extends BleException{

    private int gattStatus;

    public GattException(int gattStatus) {
        super(ERROR_CODE_GATT, "Gatt Exception Occurred!");
        this.gattStatus = gattStatus;
    }

    public int getGattStatus() {
        return gattStatus;
    }

    public void setGattStatus(int gattStatus) {
        this.gattStatus = gattStatus;
    }

    @Override
    public String toString() {
        return "GattException{" +
                "gattStatus=" + gattStatus +
                '}';
    }
}