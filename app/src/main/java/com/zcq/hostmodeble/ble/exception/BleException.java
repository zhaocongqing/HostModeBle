package com.zcq.hostmodeble.ble.exception;

import java.io.Serializable;

/**
 * Create by zcq on 7/8/22 10:48 AM
 */
public abstract class BleException implements Serializable {

    private static final long serialVersionUID = 3632344668144435511L;

    public static final int ERROR_CODE_TIMEOUT = 100;
    public static final int ERROR_CODE_GATT = 101;
    public static final int ERROR_CODE_OTHER = 102;

    private int code;
    private String description;

    public BleException(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public BleException setCode(int code) {
        this.code = code;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BleException setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "BleException{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}