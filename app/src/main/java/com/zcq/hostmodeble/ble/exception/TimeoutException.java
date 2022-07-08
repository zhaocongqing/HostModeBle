package com.zcq.hostmodeble.ble.exception;

/**
 * Create by zcq on 7/8/22 11:19 AM
 */
public class TimeoutException extends BleException{

    public TimeoutException(){
        super(ERROR_CODE_TIMEOUT, "Timeout Exception Occurred!");
    }
}