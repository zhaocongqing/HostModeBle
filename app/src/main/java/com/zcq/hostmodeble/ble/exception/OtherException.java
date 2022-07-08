package com.zcq.hostmodeble.ble.exception;

/**
 * Create by zcq on 7/8/22 11:20 AM
 */
public class OtherException extends BleException{

    public OtherException(String description) {
        super(ERROR_CODE_OTHER, description);
    }
}