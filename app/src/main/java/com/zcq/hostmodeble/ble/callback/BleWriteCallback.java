package com.zcq.hostmodeble.ble.callback;

import com.zcq.hostmodeble.ble.exception.BleException;

/**
 * Create by zcq on 7/8/22 11:51 AM
 */
public abstract class BleWriteCallback extends BleBaseCallback{

    public abstract void onWriteSuccess(int current, int total, byte[] justWrite);

    public abstract void onWriteFailure(BleException exception);

}